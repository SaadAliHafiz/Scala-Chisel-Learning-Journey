package Lab07
import chisel3._
import chisel3.util._

class Ex1 extends Module{
    val io = IO(new Bundle{
        val in = Vec(2,Flipped(Decoupled(UInt(32.W))))
        val out = Decoupled(UInt(32.W))})
    val q1 = Queue(io.in(0))
    val q2 = Queue(io.in(1))
    val arbiter = Module(new Arbiter(UInt(),2))
    arbiter.io.in(0) <> q1
    arbiter.io.in(1) <> q2
    io.out <> arbiter.io.out
}
