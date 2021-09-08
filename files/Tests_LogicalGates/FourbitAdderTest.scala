package example

import org.scalatest._
import chiseltest._
import chisel3._

class FourbitAdderGateTest extends FreeSpec with ChiselScalatestTester {
    "Full Adder Gate Test" in {
        test(new FourbitAdderGate()){c =>
        c.io.a0.poke(0.U)
        c.io.b0.poke(0.U)
        c.io.cin.poke(0.U)
        c.io.a1.poke(1.U)
        c.io.b1.poke(1.U)
        c.io.a2.poke(1.U)
        c.io.b2.poke(1.U)
        c.io.a3.poke(1.U)
        c.io.b3.poke(1.U)
        c.clock.step(1)
        c.io.cout4.expect(1.U)
        c.io.s0.expect(0.U)
        c.io.s1.expect(0.U)
        c.io.s2.expect(1.U)
        c.io.s3.expect(1.U)

        }
    }
}