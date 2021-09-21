package Lab04
import chisel3._
import chisel3.util._

class Immediate extends Bundle {
	val instr = Input(UInt(32.W))
	val immd_se = Output(UInt(32.W))
    val pc=Input(UInt(32.W))
}
class L4Task2 extends Module {
	val io = IO(new Immediate)
	io.immd_se := 0.U
	when(io.instr(6,0)==="b0100011".U){                 //S_Immediate
		io.immd_se := Cat(Fill(20,io.instr(31)),io.instr(31,25),io.instr(11,7))
	}.elsewhen(io.instr(6,0)==="b0010111".U){              //U_Immediate
		io.immd_se := (Cat(io.instr(31),io.instr(30,25),io.instr(24,21),io.instr(20),io.instr(19,12)) << 12.U)
	}.elsewhen(io.instr(6,0)==="b0010011".U){            //I_Immediate
		io.immd_se := Cat(Fill(20,io.instr(31)),io.instr(31,20))
	}.elsewhen(io.instr(6,0)==="b1100011".U){           //SB_Immediate
		io.immd_se := Cat(Fill(19,io.instr(31)),io.instr(31),io.instr(7),io.instr(30,25),io.instr(11,8), 0.U)+io.pc
	}.elsewhen(io.instr(6,0)==="b1101111".U){      //UJ_Immediate
		io.immd_se := Cat(Fill(11,io.instr(31)),io.instr(31),io.instr(19,12),io.instr(20),io.instr(30,25),io.instr(24,21), 0.U)
	}
}