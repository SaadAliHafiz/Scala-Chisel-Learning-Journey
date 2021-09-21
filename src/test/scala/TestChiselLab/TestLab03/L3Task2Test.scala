package Lab03

import org.scalatest._
import chiseltest._
import chisel3._
  
class ALU_SwitchTest extends FreeSpec with ChiselScalatestTester {

    "ALU Test" in {
        
        test(new ALU_Switch) { c =>
        
        c.io.a.poke(1.S)
        c.io.b.poke(0.S)
        c.io.sel.poke(10.U)
        c.clock.step(1)

        c.io.out.expect(0.S)
             
        }
    }

}