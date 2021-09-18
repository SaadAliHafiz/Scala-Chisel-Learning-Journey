package example

import org.scalatest._
import chiseltest._
import chisel3._

class Lab2_T2Test extends FreeSpec with ChiselScalatestTester {
    "Mux Test" in {
        test(new Lab2_T2()){c =>
        // c.io.highByte.poke("b1010".U)
        //  c.io.lowByte.poke("b0101".U)
        // c.io.x.poke("b1010".U)
        // c.io.y.poke("b1010001010".U)
        c.clock.step(1)
        // c.io.address.expect("b10100101".U)
        // c.io.duplicate.expect("b10101010".U)
        // c.io.xMSB.expect(1.U)
        // c.io.yLowByte.expect("b10001010".U)
        // c.io.allOnes.expect("b0".U)
        // c.io.parityCheck.expect(false.B)
        // c.io.anyOne.expect("b1".U)
        }
    }}