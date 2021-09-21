

package Lab04

import org.scalatest._
import chiseltest._
import chisel3._
import scala.util._

class L4Task2Test extends FreeSpec with ChiselScalatestTester {

  "Lab 4 Task 2" in {
    test(new L4Task2()) { c =>
      val inst_array = Array("h00200613","h00300693","h0000c637")
      for (i <- 0 until 100){
        val inst = inst_array(Random.nextInt(2))
        val result = inst match {
          case ("h00200613") => 2
          case ("h00300693") => 3
          case ("h0000c637") => 12
        }
        c.io.instr.poke(inst.U)
        c.io.pc.poke(4.U)
        c.io.immd_se.expect(result.U)
      }

    }}}