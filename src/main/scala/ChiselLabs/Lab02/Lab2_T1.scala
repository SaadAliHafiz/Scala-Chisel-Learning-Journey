//Arithmetic operations

package example

import chisel3._

class Lab2_T1() extends Module{
    val io= IO(new Bundle{
        val x=Input(UInt(8.W))
        val y=Input(UInt(8.W))
        val out= Output(UInt(8.W))
        // val out1= Output(UInt(8.W))
        // val out2= Output(UInt(8.W))
        // val out3= Output(UInt(8.W))
        // val out4= Output(UInt(8.W))
        // val out5= Output(UInt(8.W))
})
// Addition without width expansion
val sum = io.x + io.y // OR
// val sum1 = io.x +% io.y
// // Addition with width expansion
// val sum2 = io.x +& io.y
// // Subtraction without width expansion
// val sum3 = io.x - io.y // OR
// val sum4= io.x -% io.y
// // Subtraction with width expansion
// val sum5 = io.x -& io.y
io.out:=sum
// io.out1:=sum1
// io.out2:=sum2
// io.out3:=sum3
// io.out4:=sum4
//io.out5:=sum5
}