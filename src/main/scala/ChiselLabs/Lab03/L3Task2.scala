package Lab03
import chisel3._
import chisel3.util._

class ALU_Switch extends Module{
    val io= IO(new Bundle {
        val a=Input(SInt(8.W))
        val b=Input(SInt(8.W))
        val sel=Input(UInt(4.W))
        val out=Output(SInt(16.W))
    })

val Adr= io.a + io.b
val sub= io.a - io.b
val AndG= io.a & io.b
val ORG= io.a | io.b
val XORG=io.a ^ io.b
val s = io.b(4,0)//.asUInt
val LR_shft= io.a >> s
val L_shft= io.a << s
val AR_shft=io.a >> s
val EQU = io.a === io.b
val LST = io.a > io.b
val GRT = io.a < io.b

io.out:= 0.S
switch(io.sel){
    is (0.U){io.out:= Adr}

    is (1.U){io.out:=sub}

    is (2.U){io.out:=AndG}

    is (3.U){io.out:=ORG}
    is (4.U){io.out:=XORG}
    is (5.U){io.out:=L_shft}
    is (6.U){io.out:=LR_shft}
    is (7.U){io.out:=AR_shft}
    is (8.U){io.out:=Mux(EQU, 1.S, 0.S)}
    is (9.U){io.out:=Mux(LST, 1.S, 0.S)}
    is (10.U){io.out:=Mux(GRT, 1.S, 0.S)}
}
}