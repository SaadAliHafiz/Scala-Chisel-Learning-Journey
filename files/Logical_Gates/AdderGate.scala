package example
import chisel3._

class AdderGate extends Module{
    val io= IO(new Bundle{
        val a=Input(UInt(1.W))
        val b=Input(UInt(1.W))
        val c=Output(UInt(1.W))
        val s= Output(UInt(1.W))

    })
    io.c :=((io.a & io.b))
    io.s :=(io.a & (~io.b)) | (((~io.a) & io.b))
    
}