package example

import org.scalatest._
import chiseltest._
import chisel3._

import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation

class Task01Test extends FreeSpec with ChiselScalatestTester {
"Task01 Test" in {
    
    test(new Task01(4.S)).withAnnotations(Seq(VerilatorBackendAnnotation)) { c =>

    c.clock.step(20)


    }
}
}