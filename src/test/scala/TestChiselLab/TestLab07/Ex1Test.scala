package Lab06

import chisel3._
import chisel3 . util._
import org.scalatest._
import chiseltest._

class Ex1Test extends FreeSpec with ChiselScalatestTester {

  "Ex1 Test" in {
    test(new shift_register) {c =>
      c.io.in.poke("b1000".U)
    //   c.io.in2.poke(3.S)
    //   c.io.sta.poke(0.B)
    c.clock.step(40)
      // c.io.out.expect(3.U)
    }
  }
}