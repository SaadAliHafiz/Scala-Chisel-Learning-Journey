package Lab05

import org.scalatest._
import chiseltest._
import chisel3._

class ParametrizationTest extends FreeSpec with ChiselScalatestTester {
"Parametrized_Alu" in {
    
    test(new DataMem(new Parameters(32 , 5))) {c =>
    
    c.io.data_in.poke(154.U)
	c.io.addr.poke(56.U)
    c.io.wr_en.poke(0.B)
    c.clock.step(10)

	c.io.data_out.expect(0.U)
    }
}
}