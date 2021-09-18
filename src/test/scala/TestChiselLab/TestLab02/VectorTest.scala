package example

import org.scalatest._
import chiseltest._
import chisel3._

class VectorTest extends FreeSpec with ChiselScalatestTester {
"Vector Test" in {
    
    test(new Vector) { c =>
    
    c.io.data_in(0).poke(1.U)
    c.io.data_in(1).poke(0.U)
    c.io.data_in(2).poke(0.U)
    c.io.data_in(3).poke(1.U)
    
    c.io.data_selector.poke(1.U)
    c.io.addr.poke(1.U)       
    c.io.wr_en.poke(false.B)        

    c.clock.step(10)

    c.io.data_out.expect(0.U)

    }
}
}