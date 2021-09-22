package Lab05

import org.scalatest._
import chiseltest._
import chisel3._

class Parametrized_AluTest extends FreeSpec with ChiselScalatestTester {
"Parametrized_Alu" in {
    
    test(new Parametrized_Alu(32)) {c =>
    
    c.io.arg_x.poke(1.U)
	c.io.arg_y.poke(1.U)
	c.io.alu_oper.poke(0.U)
	//expect(c.io.out, 1)
    // c.io.s0.poke(0.B)
    // c.io.s1.poke(0.B)
    // c.io.s2.poke(0.B)    
    // c.io.s3.poke(true.B)
    c.clock.step(10)

    c.io.alu_out.expect(1.U)
    }
}
}