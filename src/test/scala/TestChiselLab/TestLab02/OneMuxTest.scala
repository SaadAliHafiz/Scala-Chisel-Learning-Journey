package example

import org.scalatest._
import chiseltest._
import chisel3._

class OneMuxTest extends FreeSpec with ChiselScalatestTester {
    "One Max" in {
        test(new OneMux){c =>
        c.io.in0.poke(1.U)
        c.io.in1.poke(0.U)
        c.io.in2.poke(0.U)
        c.io.in3.poke(1.U)
        // c.io.in4.poke(0.B)
        // c.io.in5.poke(1.B)
        // c.io.in6.poke(0.B)
        // c.io.in7.poke(1.B)
        c.io.sel.poke("b1010".U)
        c.clock.step(1)
        c.io.out.expect(1.U)
        }
    }
}