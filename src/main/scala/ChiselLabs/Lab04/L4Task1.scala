package Lab04
import chisel3._
import chisel3.util._
class L4Task1 extends Module{
	val io = IO(new Bundle{
		val sel = Input(UInt(3.W))
        val arg_x=Input(UInt(32.W))
        val arg_y=Input(UInt(32.W))
		// val branch=Input(Bool())
		val func3 = Input(UInt(3.W))
		val br_taken = Output(Bool())
})
		when(io.sel === "b000".U && io.arg_x ===io.arg_y){		
			io.br_taken := 1.U}.elsewhen(io.sel === "b001".U && io.arg_x ===io.arg_y){
            io.br_taken := 0.U}.elsewhen(io.sel === "b010".U && io.arg_x ===io.arg_y){
            io.br_taken := 0.U}.elsewhen(io.sel === "b011".U && io.arg_x ===io.arg_y){
            io.br_taken := 1.U}.elsewhen(io.sel === "b100".U && io.arg_x ===io.arg_y){
            io.br_taken := 0.U}.elsewhen(io.sel === "b101".U && io.arg_x ===io.arg_y){
            io.br_taken := 1.U}.otherwise{

                when(io.sel === "b000".U && io.arg_x > io.arg_y){		
			io.br_taken := 0.U}.elsewhen(io.sel === "b001".U && io.arg_x > io.arg_y){
            io.br_taken := 1.U}.elsewhen(io.sel === "b010".U && io.arg_x > io.arg_y){
            io.br_taken := 1.U}.elsewhen(io.sel === "b011".U && io.arg_x > io.arg_y){
            io.br_taken := 1.U}.elsewhen(io.sel === "b100".U && io.arg_x > io.arg_y){
            io.br_taken := 0.U}.elsewhen(io.sel === "b101".U && io.arg_x > io.arg_y){
            io.br_taken := 1.U}.otherwise{
                
                when(io.sel === "b000".U && io.arg_x < io.arg_y){		
			io.br_taken := 0.U}.elsewhen(io.sel === "b001".U && io.arg_x < io.arg_y){
            io.br_taken := 1.U}.elsewhen(io.sel === "b010".U && io.arg_x < io.arg_y){
            io.br_taken := 1.U}.elsewhen(io.sel === "b011".U && io.arg_x < io.arg_y){
            io.br_taken := 0.U}.elsewhen(io.sel === "b100".U && io.arg_x < io.arg_y){
            io.br_taken := 1.U}.elsewhen(io.sel === "b101".U && io.arg_x < io.arg_y){
            io.br_taken := 0.U}.otherwise{
                io.br_taken := DontCare
            }
        }
    }
}


