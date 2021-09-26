package Lab06

import org.scalatest._ 
import chisel3._ 
import chiseltest._ 
import chiseltest.experimental.TestOptionBuilder._ 
import chiseltest.internal.VerilatorBackendAnnotation

class Example8Test extends FreeSpec with ChiselScalatestTester {
    "Pipe Test" in {
        test(new Example8).withAnnotations(Seq(VerilatorBackendAnnotation)){ c =>
            c.io.in.bits.poke(9.U)
            c.io.in.valid.poke(1.B)
            c.clock.step(100)
        }
    }
}