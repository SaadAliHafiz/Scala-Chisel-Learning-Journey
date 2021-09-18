package example

import org.scalatest._
import chiseltest._
import chisel3._
class LAB2TASK1TEST extends FreeSpec with ChiselScalatestTester {
    "Mux Test" in {
        test(new Mux_2to1){c =>
        c.io.in_a.poke(1.U)
        c.io.in_b.poke(1.U)
        c.io.select.poke(0.U)
        c.clock.step(10)
        c.io.out.expect(1.U)
        }
    }
}