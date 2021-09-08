package example

import org.scalatest._
import chiseltest._
import chisel3._

class NotGateTest extends FreeSpec with ChiselScalatestTester {
    "Not Gate Test" in {
        test(new NotGate()){c =>
        c.io.a.poke(1.U)
        c.clock.step(1)
        c.io.b.expect(0.U)

        }
    }
}