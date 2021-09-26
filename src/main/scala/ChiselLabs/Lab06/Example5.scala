// package Lab06
// // one shot timer implementation
// val timer_count = RegInit (0. U (8. W ) )
// val done = timer_count === 0. U
// val next = WireInit (0.U)
// when ( reload ) {
// next := din
// }.elsewhen (! done ) {
// next := timer_count-1. U
// }
// timer_count := next