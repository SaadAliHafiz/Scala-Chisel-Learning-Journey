package example

import org.scalatest._
import chiseltest._
import chisel3._

class Lab2Exc3Test extends FreeSpec with ChiselScalatestTester {
    "One Max" in {
        test(new Lab2Exc3){c =>
        // c.io.sel.poke("b1000".U)
        c.io.in0.poke(1.U)
        c.io.in1.poke(1.U)
        c.io.in2.poke(1.U)
        c.io.in3.poke(1.U)
        // c.io.sel.poke("b0001".U)
        c.clock.step(1)
        // c.io.out.poke("b11".U)
        c.io.out1.expect("b01".U)
        }
    }
}