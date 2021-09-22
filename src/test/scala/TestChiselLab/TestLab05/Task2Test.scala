package Lab05
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._

class Task2Test extends FreeSpec with ChiselScalatestTester {

  "Lab 5 Task 1" in {
    test(new Router(UInt(16.W))) { c =>
      c.io.in.address.poke(3.U)
      c.io.in.data.poke(3.U)
      

        c.clock.step(500)
        c.io.out.data.expect(3.U)
      c.io.out.address.expect(3.U)

    }
  }
}