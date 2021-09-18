package example

import org.scalatest._ 
import chiseltest._ 
import chisel3._ 

class Lab2Exc2Test extends FreeSpec with ChiselScalatestTester {

    "Task 02 Test" in {

        test(new Lab2Exc2) { c =>
    
            c.io.in0.poke(0.B)
            c.io.in1.poke(1.B)
            c.io.in2.poke(0.B)
            c.io.in3.poke(0.B)
            c.io.in4.poke(0.B)
            c.io.in5.poke(1.B)
            c.io.in6.poke(0.B)
            c.io.in7.poke(0.B)
            c.io.sel.poke(5.U)
            c.clock.step(1)
            c.io.out.expect(1.B)

        }
    }
}