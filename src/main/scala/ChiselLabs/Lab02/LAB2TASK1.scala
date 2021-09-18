package example
import chisel3._

class Mux_2to1_IO extends Bundle {
        val in_a=Input(UInt(1.W))
        val in_b=Input(UInt(1.W))
        val select=Input(UInt(1.W))
        val out= Output(UInt(1.W))
    }
    
class Mux_2to1 extends Module{
    val io = IO(new Mux_2to1_IO)
    when(io.select===0.U){
        io.out:=io.in_a
    }.elsewhen(io.select===1.U){
        io.out:=io.in_b
    }.otherwise{
        io.out:= DontCare
    }
}
