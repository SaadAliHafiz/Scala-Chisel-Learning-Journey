package Lab03

import org.scalatest._
import chiseltest._
import chisel3._
class Decoder_SwitchTest extends FreeSpec with ChiselScalatestTester {
    "Mux Test" in {
        test(new Decoder_Switch){c =>
        c.io.in.poke(2.U)
        // c.io.y.poke(0.U)
        c.clock.step(1)
        c.io.out.expect(4.U)
        }
    }

}

