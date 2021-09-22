package Lab05
import chisel3._
import chisel3.util._

class Pack[T <: Data](gen : T) extends Bundle{
    val address = UInt(10.W)
    val data = gen
}
class Router[T <: Data](gen:T) extends Module{
    val io = IO(new Bundle{
        val in = Input(new Pack(gen))
        val out = Output(new Pack(gen))
    })
    // io.out.address:= io.in.address
    // io.out.data:= io.in.data
     io.out<>io.in
    }