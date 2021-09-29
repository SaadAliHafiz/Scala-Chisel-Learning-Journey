package Lab07

import chisel3._
import chisel3 . util._
import org.scalatest._
import chiseltest._
import chisel3.experimental.BundleLiterals._
import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation

class Task02Test extends FreeSpec with ChiselScalatestTester {

  "Lab 7 Task 2" in {
  test(new Task02).withAnnotations(Seq(VerilatorBackendAnnotation)) { c =>
      c.io.start.poke(1.B)
      c.io.in.poke(1.U)
      c.clock.step(100)
      c.io.out.expect(0.U)
      
    }
  }
}