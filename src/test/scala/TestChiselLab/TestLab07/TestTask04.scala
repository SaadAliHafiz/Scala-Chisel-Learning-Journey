package Lab06
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._
class Task04Test extends FreeSpec with ChiselScalatestTester{
    "Test6" in {
        test(new Task04(5)){c =>
            c.io.up_down.poke(false.B)  
            c.clock.step(5)
            //c.io.out.expect(0.U)
            c.io.up_down.poke(true.B)
            c.clock.step(5)   
    }
    }
}