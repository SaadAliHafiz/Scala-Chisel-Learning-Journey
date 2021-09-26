// package Lab06
// import chisel3._
// import chisel3.util._
// class Ex4 extends Module {
//     val io = IO ( new Bundle {
//        val in = Flipped(Decoupled(UInt(8.W)))
//        val out = Decoupled(UInt(8.W))
//        })

//     io.out.valid:=false.B
//     io.out.bits:=0.U
//     val Q1 = Queue(io.in,5)
//     val Q2 = Queue(Q1,5)
// io.out.ready:=false.B

//     when(Q2.valid && io.out.ready){
//         io.out.enq(Q2.deq())
//     }

//     // when (Q1.valid && io.out.ready){
//     //     io.out.enq(Q1.deq())
//     // }.otherwise{
//     //     io.out.valid:=0.B
//     // }
// }





package Lab06
import chisel3._
import chisel3.util._

class Ex4 extends Module{
    val io = IO(new Bundle{
        val in = Flipped(Decoupled(UInt(8.W)))
        val out = Decoupled(UInt(8.W))
    })

    io.out.valid := false.B
    io.out.bits := 0.U
    val queue_1 = Queue(io.in,5)
    val queue_2 = Queue(queue_1,5)

    
queue_1.nodeq()
queue_2.nodeq()
    when(queue_2.valid && io.out.ready){
        io.out.enq(queue_2.deq())
    }

}