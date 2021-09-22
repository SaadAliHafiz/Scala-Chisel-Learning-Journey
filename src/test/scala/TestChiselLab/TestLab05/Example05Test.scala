package Lab05

import chisel3._
import chisel3 . util._
import org.scalatest._
import chiseltest._

class Example05Test extends FreeSpec with ChiselScalatestTester {

  "Lab5e2" in {
    test(new Top(18,30,32)) {c =>
      c.io.in.poke(22.U)
      c.io.out.expect(44.U)
    }
  }
}