package Lab03

import org.scalatest._
import chiseltest._
import chisel3._
  
class L3Ass2Test extends FreeSpec with ChiselScalatestTester {

    "ALU Test" in {
        test(new L3Ass2){c =>
            c.io.instr.poke("b10100000000000100010011".U)
            c.io.pc.poke(0.U)
            c.io.immd_se.expect(5.U)
        }
    }

}


