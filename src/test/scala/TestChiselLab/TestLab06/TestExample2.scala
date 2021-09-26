package Lab06

import chisel3._
import chisel3 . util._
import org.scalatest._
import chiseltest._

class Example2Test extends FreeSpec with ChiselScalatestTester {

  "Example2" in {
    test(new Example2) {c =>
      c.io.in.poke(1.B)
    //   c.io.in2.poke(3.S)
    //   c.io.sta.poke(0.B)
    c.clock.step(100)
      // c.io.out.expect(3.U)
    }
  }
}
