package Lab05

import chisel3._
import chisel3 . util._
import org.scalatest._
import chiseltest._

class EX2Test extends FreeSpec with ChiselScalatestTester {

  "Lab5e2" in {
    test(new EX2(SInt(32.W))) {c =>
      c.io.in1.poke(-2.S)
      c.io.in2.poke(3.S)
      c.io.sel.poke(0.B)
      c.io.out.expect(-2.S)
    }
  }
}