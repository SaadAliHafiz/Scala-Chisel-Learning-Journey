package Lab07
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class Ex1Test extends FreeSpec with ChiselScalatestTester{
    "EX1" in {
        test(new Ex1){c =>
        c.io.in(0).bits.poke(1.U)
        c.io.in(0).valid.poke(1.B)
        c.io.in(1).bits.poke(2.U)
        c.io.in(1).valid.poke(1.B)
        c.clock.step(5)
        }
    }
}
