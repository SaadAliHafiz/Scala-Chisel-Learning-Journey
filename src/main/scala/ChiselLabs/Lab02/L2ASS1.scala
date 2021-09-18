// package example
// import chisel3._
// import chisel3.util._

// class LM_IO_Interface1 extends Bundle{
//     val s0 = Input(UInt(1.W))
//     val s1 = Input(UInt(1.W))
//     val s2 = Input(UInt(1.W))
//     val out=Output(UInt(32.W))
// }
// class L2ASS1 extends Module {
// val io = IO( new LM_IO_Interface1)
// // val Mux4to1= Mux(io.s1,Mux(io.s0,io.in3,io.in2),
// // Mux(io.s0,io.in1,io.in0))

// // val Mux12=Mux(io.s0,io.in0,io.in1) //8
// // val Mux13=Mux(io.s0,io.in2,io.in3) //0
// // val Mux14=Mux(io.s1,Mux12,Mux13)   //8
// // io.out:= Mux(io.s2,io.in4,Mux14)   //8
// val sel = Cat(io.s2,io.s1,io.s0)
//  io.out := MuxCase( false.B , Array (
        
//         ( sel === "b000".U ) -> 0.U,
        
//         ( sel === "b001".U ) -> 8.U,

//         ( sel === "b010".U ) -> 16.U,

//         ( sel === "b011".U ) -> 24.U,

//         ( sel(3) === 1.B ) -> 32.U

// ))
// }

