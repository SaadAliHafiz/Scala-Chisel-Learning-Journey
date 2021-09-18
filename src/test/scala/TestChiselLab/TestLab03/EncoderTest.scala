package Lab03

import org.scalatest._
import chiseltest._
import chisel3._
class EncoderTest extends FreeSpec with ChiselScalatestTester {
    "Mux Test" in {
        test(new Encoder){c =>
        c.io.in.poke(2.U)
        // c.io.y.poke(0.U)
        c.clock.step(1)
        c.io.out.expect(1.U)
        }
    }

}

