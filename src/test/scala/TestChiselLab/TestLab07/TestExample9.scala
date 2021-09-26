package Lab06

import org.scalatest._ 
import chisel3._ 
import chiseltest._ 
import chiseltest.experimental.TestOptionBuilder._ 
import chiseltest.internal.VerilatorBackendAnnotation

class Example9Test extends FreeSpec with ChiselScalatestTester {
    "Queue Test" in {
        test(new My_Queue).withAnnotations(Seq(VerilatorBackendAnnotation)){ c =>
            c.io.in.bits.poke(9.U)
            c.io.in.valid.poke(1.B)
            c.io.in.ready.expect(1.B)
            c.clock.step(100)
        }
    }
}