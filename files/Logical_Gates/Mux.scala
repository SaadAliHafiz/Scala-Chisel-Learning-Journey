package example
import chisel3._

class Mux extends Module{
    val io= IO(new Bundle{
        val a=Input(UInt(1.W))
        val b=Input(UInt(1.W))
        val sel=Input(UInt(1.W))
        val out= Output(UInt(1.W))
    })
    when(io.sel===0.U){
        io.out:=io.a
    }.elsewhen(io.sel===1.U){
        io.out:=io.b
    }.otherwise{
        io.out:= DontCare
    }
}