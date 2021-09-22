package Lab05

import chisel3._
import chisel3 . util._
import org.scalatest._
import chiseltest._

class ModuleTest extends FreeSpec with ChiselScalatestTester {

  "Lab5e2" in {
    test(new Module1(SInt(32.W))) {c =>
    
      c.io.in1.poke(-2.S)
      c.io.in2.poke(3.S)
      c.io.sel.poke(0.B)
      c.io.out1.expect(-2.S)
      c.io.out2.expect(3.S)

    }
  }
}