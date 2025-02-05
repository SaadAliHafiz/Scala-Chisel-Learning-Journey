package example

import org.scalatest._
import chiseltest._
import chisel3._

import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation

class Task02Test extends FreeSpec with ChiselScalatestTester {
    
    "Task 02 Test" in {
    
    test(new Task02(4.U)).withAnnotations(Seq(VerilatorBackendAnnotation)) { c =>

    c.clock.step(20)

}}}