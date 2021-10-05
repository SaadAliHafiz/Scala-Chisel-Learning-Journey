package Lab07
import chisel3._
import chisel3.util._
import chisel3.experimental.ChiselEnum

class Task02 extends Module {
        val io =IO (new Bundle {
        val in =Input(UInt(1.W ) )
        val start =Input(Bool() )
        val out =Output(UInt(8.W ) )
})
val s0 :: s1 :: Nil= Enum(2)
val stateReg= RegInit(s0)
val outReg=RegInit(0.U(5.W))
io.out:=0.U
when(stateReg===s0){
    when(io.start===1.B){
        stateReg:=s1}.otherwise{
            io.out:=outReg
            }
    }.elsewhen(stateReg===s1){
        when(io.start===0.B){
            stateReg:=s0}.otherwise{
                io.out:=stateReg
        }
    }
}