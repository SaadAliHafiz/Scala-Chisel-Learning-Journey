package Lab07

import chisel3._
import org.scalatest._
import chiseltest._

class Example1Test extends FreeSpec with ChiselScalatestTester {
    
    "Example 01" in {
        
        test(new Detect_Seq) {c =>
        
        c.io.in.poke(true.B)
        c.clock.step(40)
        // c.io.out.expect(true.B)

    }
  }
}