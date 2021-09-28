package Lab07
import chisel3._
import chisel3.util._
import chisel3.experimental.ChiselEnum

class Task1 extends Module{
    val io = IO(new Bundle{
        val f1 = Input(Bool())
        val f2 = Input(Bool())
        val r1 = Input(Bool())
        val r2 = Input(Bool())
        val out = Output(UInt(4.W))
    })
    val s0 :: s1 :: s2 :: s3 :: s4 :: s5 :: Nil = Enum(6)
    val state = RegInit(s0)
    io.out := 0.U
    when(state===s0 && io.f1 === 0.B && io.f2 === 0.B)          //s0
    {state := s0
    io.out := 0.U}.elsewhen(state===s0 && io.f1 === 1.B && io.f2 === 0.B)
    {state := s1
    io.out := 0.U}.elsewhen(state===s0 && io.f1 === 0.B && io.f2 === 1.B)
    {state := s5
    io.out := 0.U}.elsewhen(state===s0 && io.f1 === 1.B && io.f2 === 1.B)
    {state := s1
    io.out := 0.U}

    when(state===s1 && io.f1 === 0.B && io.r1 === 0.B)          //s1
    {state := s0
    io.out := 0.U}.elsewhen(state===s1 && io.f1 === 1.B)
    {state := s2
    io.out := 0.U}.elsewhen(state===s1 && io.f1 === 0.B && io.r1 === 1.B)
    {state := s0
    io.out := 0.U}
    
    when(state===s2 && io.f1 === 0.B && io.r1 === 0.B)          //s2
    {state := s2
    io.out := 3.U}.elsewhen(state===s2 && io.f1 === 1.B)
    {state := s3
    io.out := 3.U}.elsewhen(state===s2 && io.f1 === 0.B && io.r1 === 1.B)
    {state := s1
    io.out := 3.U}

    when(state===s3)                                //s3
    {state := s0
    io.out := 0.U}

    when(state===s4 && io.f2 === 1.B)               //s4
    {state := s3
    io.out := 7.U}.elsewhen(state===s4 && io.f2 === 0.B && io.r2 === 0.B)
    {state := s4
    io.out := 7.U}.elsewhen(state===s4 && io.f2 === 0.B && io.r2 === 1.B)
    {state := s5
    io.out := 7.U}

    when(state===s5 && io.f2 === 1.B)               //s5
    {state := s4
    io.out := 0.U}.elsewhen(state===s5 && io.f2 === 0.B && io.r2 === 0.B)
    {state := s5
    io.out := 0.U}.elsewhen(state===s5 && io.f2 === 0.B && io.r2 === 1.B)
    {state := s0
    io.out := 0.U}
}