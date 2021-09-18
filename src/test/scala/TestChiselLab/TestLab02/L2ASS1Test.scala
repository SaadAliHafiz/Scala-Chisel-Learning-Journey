// package Lab02
// // import example._
// import org.scalatest._
// import chiseltest._
// import chisel3._

// class L2ASS1Test extends FreeSpec with ChiselScalatestTester {
// "Ass 01 Test" in {
    
//     test(new L2ASS1) { c =>
    
//     // c.io.in0.poke(0.U)
//     // c.io.in1.poke(8.U)
//     // c.io.in2.poke(16.U)
//     // c.io.in3.poke(24.U)    
//     // c.io.in4.poke(32.U)
//     c.io.s0.poke(1.B)
//     c.io.s1.poke(1.B)
//     c.io.s2.poke(1.B)    
//     // c.io.s3.poke(true.B)

//     c.clock.step(10)

//     c.io.out.expect(32.U)

//     }
// }
// }