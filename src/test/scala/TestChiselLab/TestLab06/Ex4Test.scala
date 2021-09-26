package Lab06

import chisel3._
import chisel3 . util._
import org.scalatest._
import chiseltest._

class Ex4Test extends FreeSpec with ChiselScalatestTester {

  "Lab 6 Ex 4" in {
    test(new Ex4) { c =>
      c.io.in.valid.poke(true.B)
            c.io.in.bits.poke(2.U)  
            c.io.out.ready.poke(true.B)
            c.clock.step(10)
    
    }
  }
}