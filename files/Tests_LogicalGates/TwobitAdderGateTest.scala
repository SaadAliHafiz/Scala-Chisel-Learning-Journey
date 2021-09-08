package example

import org.scalatest._
import chiseltest._
import chisel3._

class TwobitAdderGateTest extends FreeSpec with ChiselScalatestTester {
    "Two bit Adder Gate Test" in {
        test(new TwobitAdderGate()){c =>
        c.io.a1.poke(0.U)
        c.io.a2.poke(1.U)
        c.io.b1.poke(0.U)
        c.io.b2.poke(0.U)
        c.clock.step(1)
        c.io.c1.expect(0.U)
        c.io.s1.expect(0.U)
        c.io.s2.expect(1.U)
        c.io.c2.expect(0.U)

        }
    }
}