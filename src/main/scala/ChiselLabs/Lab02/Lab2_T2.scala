package example
import chisel3._
import chisel3.util._
class Lab2_T2 extends Module{
    val io=IO(new Bundle{
            val x= Input(UInt(8.W))
            val y= Input(UInt(8.W))

            // val xMSB=Output(UInt(1.W))
            // val yLowByte=Output(UInt(8.W))
            // val address=Output(UInt(8.W))
            // val duplicate=Output(UInt(8.W))
            var data=Input(UInt(8.W))
            // val lowByte=Input(UInt(4.W))
            // val highByte=Input(UInt(4.W))
            // val allOnes=Output(UInt(8.W))
            val anyOne=Output(UInt(8.W))
            // var parityCheck=Output(Bool())
    })
    // Bitfield manipulations
// io.xMSB := io.x(3)
// when x is 32 - bit
// io.yLowByte := io.y(7,0) // y is atleat 8 - bit
//                         // concatenates bitfields with first operand on left
// io.address := Cat( io.highByte , io.lowByte )
// replicate a string multiple times
// io.duplicate := Fill(2 ,"b1010".U ) // " b10101010 ". U
// // Bitfield reductions
io.data = "b00111010".U
// io.allOnes := io.data.andR
io.anyOne := io.data.orR
// io.parityCheck := io.data.xorR
// performs AND reduction
// performs OR reduction
// performs XOR reduction
}
