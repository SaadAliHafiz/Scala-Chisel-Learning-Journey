package Lab05
import chisel3._
import chisel3.util._

class bun[T <:Data](gen : T) extends Bundle{
    val out = Output(gen)
    val in1 = Input(gen)
    val in2 = Input(gen)
    val sel = Input(Bool())
}
class EX2 [T <: Data](gen : T) extends Module{
    val io = IO(new bun(gen))
    io.out := Mux( io.sel , io.in2 , io.in1 )
}