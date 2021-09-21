package Lab03

import org.scalatest._
import chiseltest._
import chisel3._
class L3Task1Test extends FreeSpec with ChiselScalatestTester {
    "Mux Test" in {
        test(new Encoder_Switch){c =>
        c.io.in.poke(4.U)
        // c.io.y.poke(0.U)
        c.clock.step(1)
        c.io.out.expect(2.U)
        }
    }

}

