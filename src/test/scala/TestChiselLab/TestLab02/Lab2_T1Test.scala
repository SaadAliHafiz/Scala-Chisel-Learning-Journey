package example

import org.scalatest._
import chiseltest._
import chisel3._
class Lab2_T1Test extends FreeSpec with ChiselScalatestTester {
    "Mux Test" in {
        test(new Lab2_T1()){c =>
        c.io.x.poke(2.U)
        c.io.y.poke(0.U)
        c.clock.step(1)
        c.io.out.expect(2.U)
        }
    }
// class Lab2_T1Test1 extends FreeSpec with ChiselScalatestTester {
//     "Mux Test" in {
//         test(new Lab2_T1()){c =>
//         c.io.x.poke(1.U)
//         c.io.y.poke(0.U)
//         c.clock.step(1)
//         c.io.out1.expect(1.U)
//         }
//     }
// }
// class Lab2_T1Test2 extends FreeSpec with ChiselScalatestTester {
//     "Mux Test" in {
//         test(new Lab2_T1()){c =>
//         c.io.x.poke(1.U)
//         c.io.y.poke(0.U)
//         c.clock.step(1)
//         c.io.out2.expect(1.U)
//         }
//     }
// }
// class Lab2_T1Test3 extends FreeSpec with ChiselScalatestTester {
//     "Mux Test" in {
//         test(new Lab2_T1()){c =>
//         c.io.x.poke(5.U)
//         c.io.y.poke(1.U)
//         c.clock.step(1)
//         c.io.out3.expect(4.U)
//         }
//     }
// }
// class Lab2_T1Test4 extends FreeSpec with ChiselScalatestTester {
//     "Mux Test" in {
//         test(new Lab2_T1()){c =>
//         c.io.x.poke(1.U)
//         c.io.y.poke(0.U)
//         c.clock.step(1)
//         c.io.out4.expect(1.U)

//         }
//     }
// }
// class Lab2_T1Test5 extends FreeSpec with ChiselScalatestTester {
//     "Mux Test" in {
//         test(new Lab2_T1()){c =>
//         c.io.x.poke(5.U)
//         c.io.y.poke(2.U)
//         c.clock.step(1)
//         c.io.out5.expect(3.U)
//         }
//     }
}

