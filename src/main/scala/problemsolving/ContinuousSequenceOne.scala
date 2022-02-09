package problemsolving

object ContinuousSequenceOne extends App {

  val list = List(1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1)

  var count = 0
  var countMax = 0
  for (i <- list) {
    if (i == 0) {
      count = 0
    }
    else {
      count = count + 1
    }
    if (countMax < count) {
      countMax = count
    }
  }
  println(countMax)

}
