package example

import org.scalatest._
import chiseltest._
import chisel3._

class MuxTreeTest extends FreeSpec with ChiselScalatestTester {
    "Mux Tree" in {
        test(new MuxTree){c =>
        c.io.in.poke("b01010101".U)
        // c.io.in(1).poke(1.B)
        // c.io.in(2).poke(0.B)
        // c.io.in(3).poke(1.B)
        // c.io.in(4).poke(0.B)
        // c.io.in(5).poke(1.B)
        // c.io.in(6).poke(0.B)
        // c.io.in(7).poke(1.B)
        c.io.s0.poke(1.B)
        c.io.s1.poke(1.B)
        c.io.s2.poke(1.B)
        c.clock.step(1)
        c.io.out.expect(0.B)
        }
    }
}