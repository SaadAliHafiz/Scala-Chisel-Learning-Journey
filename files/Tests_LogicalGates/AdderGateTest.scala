package example

import org.scalatest._
import chiseltest._
import chisel3._

class AdderGateTest extends FreeSpec with ChiselScalatestTester {
    "Adder Gate Test" in {
        test(new AdderGate()){c =>
        c.io.a.poke(1.U)
        c.io.b.poke(1.U)
        c.clock.step(1)
        c.io.c.expect(1.U)
        c.io.s.expect(0.U)

        }
    }
}