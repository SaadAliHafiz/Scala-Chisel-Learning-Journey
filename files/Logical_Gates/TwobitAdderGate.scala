package example
import chisel3._

class TwobitAdderGate extends Module{
    val io= IO(new Bundle{
        val a1=Input(UInt(1.W))
        val b1=Input(UInt(1.W))
        val c1=Output(UInt(1.W))
        val s1= Output(UInt(1.W))
        val a2=Input(UInt(1.W))
        val b2=Input(UInt(1.W))
        val c2=Output(UInt(1.W))
        val s2= Output(UInt(1.W))

    })
    io.c1 :=((io.a1 & io.b1))
    io.s1 :=(io.a1 & (~io.b1)) | (((~io.a1) & io.b1))
    io.c2 :=((io.a2 & io.b2))
    io.s2 :=(io.a2 & (~io.b2)) | (((~io.a2) & io.b2))
    
}