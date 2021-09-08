package example
import chisel3._

class FourbitAdderGate extends Module{
    val io= IO(new Bundle{
        val a0=Input(UInt(1.W))
        val a1=Input(UInt(1.W))
        val a2=Input(UInt(1.W))
        val a3=Input(UInt(1.W))
        val b0=Input(UInt(1.W))
        val b1=Input(UInt(1.W))
        val b2=Input(UInt(1.W))
        val b3=Input(UInt(1.W))
        val cin=Input(UInt(1.W))
        val s0= Output(UInt(1.W))
        val s1= Output(UInt(1.W))
        val s2= Output(UInt(1.W))
        val s3= Output(UInt(1.W))
        val cout1=Output(UInt(1.W))
        val cout2=Output(UInt(1.W))
        val cout3=Output(UInt(1.W))
        val cout4=Output(UInt(1.W))
    })
    io.s0 := io.a0 ^ io.b0 ^ io.cin
    io.cout1 :=(io.a0 & io.b0) | (io.a0 & io.cin)| (io.b0 & io.cin)
    io.s1 := io.a1 ^ io.b1 ^ io.cout1
    io.cout2 :=(io.a1 & io.b1) | (io.a1 & io.cout1)| (io.b1 & io.cout1)
    io.s2 := io.a2 ^ io.b2 ^ io.cout2
    io.cout3 :=(io.a2 & io.b2) | (io.a2 & io.cout2)| (io.b2 & io.cout2)
    io.s3 := io.a3 ^ io.b3 ^ io.cout3
    io.cout4 :=(io.a3 & io.b3) | (io.a3 & io.cout3)| (io.b3 & io.cout3)
    
}