package Lab03

import org.scalatest._
import chiseltest._
import chisel3._

class L3Ass1Test extends FreeSpec with ChiselScalatestTester {

  "Lab 3 Ass 1" in {
    test(new L3Ass1) { c =>
      c.io.arg_x.poke(40.U)
      c.io.arg_y.poke(40.U)
      c.io.func3.poke("b101".U)
      c.io.branch.poke(1.B)
      c.io.branch_taken.expect(1.U)
    }
  }
}