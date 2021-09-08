package example
import chisel3._

class FourToOneMux extends Module{
    val io= IO(new Bundle{
        val a=Input(UInt(1.W))
        val b=Input(UInt(1.W))
        val c=Input(UInt(1.W))
        val d=Input(UInt(1.W))
        val sel1=Input(UInt(1.W))
        val sel2=Input(UInt(1.W))
        val out= Output(UInt(1.W))
    })
    when(io.sel1===0.U && io.sel2===0.U){
        io.out:=io.a
    }.elsewhen(io.sel1===1.U && io.sel2===0.U){
        io.out:=io.b
    }.elsewhen(io.sel1===0.U && io.sel2===1.U){
        io.out:=io.c
    }.otherwise{
        io.out:= io.d
    }

}