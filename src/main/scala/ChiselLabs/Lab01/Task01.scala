package example

import chisel3._

class Task01(counterBits : SInt) extends Module {
    val io = IO ( new Bundle {
    val result = Output(Bool())
})

    val max = (1.S << counterBits.asUInt ) - 1.S
    val count = RegInit (0.S(16. W ))

    when ( count === max ) {
    count := 0.S
    }.otherwise {count := count + 1.S}

    io.result := count(15)
    println ( s" counter created with max value $max " )
    
}