package example
import org.scalatest._
import chiseltest._
import chisel3._

class Task3Test extends FreeSpec with ChiselScalatestTester {
"Vector Test" in {
    
    test(new Task3) { c =>
    
    c.io.in(0).poke(1.B)
    c.io.in(1).poke(0.B)
    c.io.in(2).poke(0.B)
    c.io.in(3).poke(1.B)
    c.io.shift_type.poke(false.B)
    c.io.sel(0).poke(1.B)
    c.io.sel(1).poke(1.B)       

    c.clock.step(10)

    }
}
}