
package Lab05
import org.scalatest._
import chiseltest._
import chisel3._

class TypeParametrizedTest extends FreeSpec with ChiselScalatestTester {
"Parametrized_Alu" in {
    
    test(new TypeParametrized(SInt(32.W))) {c =>
    
    c.io.in1.poke(1.S)
	c.io.in2.poke(1.S)
	c.io.sel.poke(0.B)
	//expect(c.io.out, 1)
    // c.io.s0.poke(0.B)
    // c.io.s1.poke(0.B)
    // c.io.s2.poke(0.B)    
    // c.io.s3.poke(true.B)
    c.clock.step(10)
    c.io.out.expect(1.S)
    }
}
}