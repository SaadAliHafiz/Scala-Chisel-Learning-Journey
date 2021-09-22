package Lab05

import chisel3._
import chisel3 . util._
import org.scalatest._
import chiseltest._

class EX3Test extends FreeSpec with ChiselScalatestTester {
  "Lab5e3" in {
    test(new EX3(4,UInt(4.W))(_+_)){c =>
      c.io.in(0).poke(2.U)
      c.io.in(1).poke(4.U)
      c.io.in(2).poke(3.U)
      c.io.in(3).poke(2.U)
      c.io.out(0).expect(11.U)
      c.io.out(1).expect(11.U)
      c.io.out(2).expect(11.U)
      c.io.out(3).expect(11.U)
      // c.io.out(1).expect(19.U)
      // c.io.out(2).expect(19.U)
      // c.io.out(3).expect(19.U)
    }
  }
}