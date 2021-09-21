
package Lab03

import org.scalatest._
import chiseltest._
import chisel3._
  
class L3Ass3Test extends FreeSpec with ChiselScalatestTester {
    "TaskT 3" in {
        test(new L3Ass2){c =>
            c.io.instr.poke("h0080056f".U)
            c.clock.step(10)
            c.io.immd_se.expect(4.U)
        }
    }

}


