package Lab07

import chisel3._
import org.scalatest._
import chiseltest._


class Example02Test extends FreeSpec with ChiselScalatestTester {
    
    "Example 02" in {
        
        test(new CounterUpDown(3)) {c =>
        
        c.io.data_in.poke(3.U)
        c.clock.step(20)
        // c.io.out.expect(true.B)

    }
  }
}