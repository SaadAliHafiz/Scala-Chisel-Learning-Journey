package Lab06
import chisel3._
import chisel3.util._
class Task04(max: Int ) extends Module {
    val io = IO ( new Bundle {
    val out = Output ( UInt ( max.W ) )
    val up_down = Input ( Bool () )
    })
    io.out:=0.U
    val count= RegInit(0.U(max.W))
    when(io.up_down === 1.B){
        count := count+1.U
        io.out:=count
    }.elsewhen(io.up_down === 0.B){
        count := count-1.U
        io.out:=count
    }
// Start code here
// End your code here
}