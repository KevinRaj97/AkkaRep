package problemsolving

object ContinuousOne extends App {

  val list = List(1, 1, 1, 0, 1, 4, 5, 1)

  var count = 0
  for (i <- list) {
    if (i == 1) {
      count = count + 1
    }
  }
  println(count)

}
