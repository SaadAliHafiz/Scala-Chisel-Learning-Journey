package Lab03

import org.scalatest._
import chiseltest._
import chisel3._

class ALUTest extends FreeSpec with ChiselScalatestTester {
"Ass 01 Test" in {
    
    test(new ALU) {c =>
    
    c.io.in_A.poke(1.U)
	c.io.in_B.poke(1.U)
	c.io.alu_Op.poke(8.U)
    c.io.sum.expect(2.U)
	//expect(c.io.out, 1)
    // c.io.s0.poke(0.B)
    // c.io.s1.poke(0.B)
    // c.io.s2.poke(0.B)    
    // c.io.s3.poke(true.B)
    c.clock.step(10)

    c.io.out.expect(0.U)

    }
}
}