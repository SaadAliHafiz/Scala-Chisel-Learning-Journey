package example

import org.scalatest._
import chiseltest._
import chisel3._

class FourToOneMuxTest extends FreeSpec with ChiselScalatestTester {
    "Mux Test" in {
        test(new FourToOneMux()){c =>
        c.io.a.poke(1.U)
        c.io.b.poke(0.U)
        c.io.c.poke(1.U)
        c.io.d.poke(0.U)
        c.io.sel1.poke(0.U)
        c.io.sel2.poke(1.U)
        c.clock.step(1)
        c.io.out.expect(1.U)
        }
    }
}