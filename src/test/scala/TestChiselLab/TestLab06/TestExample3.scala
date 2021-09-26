package Lab06

import chisel3._
import chisel3 . util._
import org.scalatest._
import chiseltest._

class Example3Test extends FreeSpec with ChiselScalatestTester {

  "Lab5e2" in {
    test(new counter(32)) {c =>
      // c.io.in.poke(1.B)
    //   c.io.in2.poke(3.S)
    //   c.io.sta.poke(0.B)
    c.clock.step(40)
      // c.io.out.expect(3.U)
    }
  }
}