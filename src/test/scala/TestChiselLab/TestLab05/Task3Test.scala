package Lab05
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._

class Task3Test extends FreeSpec with ChiselScalatestTester {

  "Lab 5 Task 3" in {
    test(new Task3(UInt(16.W),UInt(16.W))) { c =>
      c.io.in1.poke(2.U)
      c.io.in2.poke(1.U)
      c.io.sel.poke(1.B)

        c.clock.step(500)

      c.io.out.expect(1.U)

    }
  }
}