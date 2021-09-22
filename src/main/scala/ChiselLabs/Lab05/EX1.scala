package Lab05
import chisel3._
import chisel3.util._
// import chisel3.iotesters.{Driver,PeekPokeTest}

class EX1(width_parameter:Int ) extends Module{
val io = IO (new IO_Interface_EX1(width_parameter))
io.alu_out:= 0.U
val index = log2Ceil(width_parameter)

when(io.alu_oper ==="b0000".U )
{io.alu_out:= io.arg_x & io.arg_y}.elsewhen ("b0001".U===io.alu_oper)
{io.alu_out:= io.arg_x | io.arg_y}.elsewhen ("b0010".U===io.alu_oper)
{io.alu_out:= io.arg_x + io.arg_y}.elsewhen ("b0110".U===io.alu_oper) 
{io.alu_out := io.arg_x - io.arg_y}.elsewhen ("b0011".U===io.alu_oper)
{io.alu_out:= io.arg_x ^ io.arg_y}.elsewhen ("b0100".U===io.alu_oper)
{io.alu_out:= io.arg_x << io.arg_y(index-1,0)}.elsewhen ("b0101".U===io.alu_oper)
{io.alu_out:= io.arg_x >> io.arg_y(index-1,0)}.elsewhen ("b0111".U===io.alu_oper)
{io.alu_out:= (io.arg_x.asSInt >> io.arg_y(index-1,0)).asUInt}.elsewhen ( "b1000".U===io.alu_oper)
{io.alu_out:= io.arg_x.asSInt < io.arg_y.asSInt}.elsewhen ("b1001".U===io.alu_oper)
{io.alu_out := io.arg_x < io.arg_y}
}
class IO_Interface_EX1( width : Int ) extends Bundle {
val alu_oper = Input(UInt(width.W))
val arg_x = Input(UInt(width.W))
val arg_y = Input(UInt(width.W))
val alu_out = Output(UInt(width.W))

}
