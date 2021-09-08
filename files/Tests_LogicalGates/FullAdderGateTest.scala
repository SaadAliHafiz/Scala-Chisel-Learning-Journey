package example

import org.scalatest._
import chiseltest._
import chisel3._

class FullAdderGateTest extends FreeSpec with ChiselScalatestTester {
    "Full Adder Gate Test" in {
        test(new FullAdderGate()){c =>
        c.io.a.poke(1.U)
        c.io.b.poke(1.U)
        c.io.cin.poke(0.U)
        c.clock.step(1)
        c.io.cout.expect(1.U)
        c.io.s.expect(0.U)

        }
    }
}