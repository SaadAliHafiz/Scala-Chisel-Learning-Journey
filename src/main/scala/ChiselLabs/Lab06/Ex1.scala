package Lab06
import chisel3._
import chisel3.util._

class shift_register extends Module {
val io = IO (new Bundle {
val in = Input(UInt(4.W))
val out = Output(UInt(1.W))
})
val state = RegInit(0.U(4.W))
val load_shift = RegInit(0.U(1.W))

io.out := 0.U
when(load_shift === 0.U){
state := io.in
load_shift := load_shift+1.U
}.otherwise{
state := (state >> 1)
io.out := state(3)
}
}