package example

import chisel3._ 
import chisel3.util._ 


class Lab2Exc2 extends Module {
    
    val io = IO ( new Bundle {
        val in0 = Input(UInt(1.W))
        val in1 = Input(UInt(1.W))
        val in2 = Input(UInt(1.W))
        val in3 = Input(UInt(1.W))
        val in4 = Input(UInt(1.W))
        val in5 = Input(UInt(1.W))
        val in6 = Input(UInt(1.W))
        val in7 = Input(UInt(1.W))
        val sel = Input(UInt(3.W))
        val out = Output(UInt(1.W))
    })
    val MuxLookup1 = MuxLookup(io.sel(1), false.B, Array(
        
        (0.U) -> MuxLookup(io.sel(0),false.B, Array(

            (0.U) -> io.in0,
            (1.U) -> io.in1

        )),
        
        (1.U) -> MuxLookup(io.sel(0), false.B, Array(

            (0.U) -> io.in2,
            (1.U) -> io.in3

        ))
    ))

    val MuxLookup2 = MuxLookup(io.sel(1), false.B, Array(
        
        (0.U) -> MuxLookup(io.sel(0), false.B, Array(
            
            (0.U) -> io.in4,
            (1.U) -> io.in5

        )),

        (1.U) -> MuxLookup(io.sel(0), false.B, Array(
            (0.U) -> io.in6,
            (1.U) -> io.in7
        ))
    ))

    io.out := MuxLookup(io.sel(2), false.B, Array(

        (0.U) -> MuxLookup1,
        (1.U) -> MuxLookup2

    ))


}