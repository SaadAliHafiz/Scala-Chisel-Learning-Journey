package Lab04
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._
import scala.util.Random
import ALUOP._
class L4Task1Test extends FreeSpec with ChiselScalatestTester {
  "Lab 4 ALU" in {
    test(new L4Task1) { c =>
        val array_op = Array ("b000","b001","b010","b011","b100","b101")
        for ( i <- 0 until 2) {
            val a = Random.nextLong() & 0xFFFFFFFFL
            val b = Random.nextLong() & 0xFFFFFFFFL
            val func = Random.nextInt (6)
            val f3 = array_op(func)
            val result = f3 match {
              case "b000" => if (a == b) 1 else 0
              case "b001" => if (a != b) 0 else 1
              case "b010" => if (a < b) 1 else 0
              case "b011" => if (a < b) 1 else 0
              case "b100" => if (a >= b) 0 else 1
              case "b101" => if (a >= b) 1 else 0
              case _ => 0
            }
        c.io.arg_x.poke(a.U)
        println("value of a"+a)
        c.io.arg_y.poke(b.U)
        println("value of b"+b)
        c.io.func3.poke(f3.U)
        c.clock.step(1)
        c.io.br_taken.expect(result.B)
        }
    }
}
}