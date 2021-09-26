package Lab06
import chisel3._
import chisel3.util._

class counter_with_xor ( val max : Int) extends Bundle {
    val in =Input(UInt(max.W))
    val out = Output(UInt(max.W))
}
class Task02 (val max: Int) extends Module{
    val io=IO(new counter_with_xor(max))
    val counter = RegInit(0.S(4.W))
    io.out:=0.U
    when(counter(4.U) ^ 1.B === 0.B){
            counter := 0.S
    } .otherwise {
        counter := counter + 1.S
    }   
    io.out := counter(15.U)
}