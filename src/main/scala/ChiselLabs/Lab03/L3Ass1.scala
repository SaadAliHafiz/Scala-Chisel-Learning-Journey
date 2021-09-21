package Lab03
import chisel3._
import chisel3.util._

class L3Ass1 extends Module{
    val io = IO(new Bundle{
        val func3 = Input(UInt(3.W))
        val branch = Input(UInt(1.W))
        val arg_x = Input(UInt(32.W))
        val arg_y = Input(UInt(32.W))
        val branch_taken = Output(UInt(1.W))
    })
    io.branch_taken := 0.U
    var Bl = 0.U
    when(io.arg_x===io.arg_y && io.func3==="b00".U){
        Bl = 1.U
    }.elsewhen(io.arg_x=/=io.arg_y && io.func3==="b001".U){
        Bl = 1.U
    }.elsewhen((io.arg_x < io.arg_y) && (io.func3==="b100".U || io.func3==="b110".U)){
        Bl = 1.U
    }.elsewhen((io.arg_x >= io.arg_y) && (io.func3==="b101".U || io.func3==="b111".U)){
        Bl = 1.U
    }

    when(io.branch===1.U && Bl=== 1.U){
        io.branch_taken := 1.U
    }.otherwise{
        io.branch_taken := 0.U
    }

}