package problemsolving

object CountInArray extends App {

  def count(a: Array[Int]): Unit = {
    var count = 0
    for (i <- a) {
      count = count + i
      //      println(i)
    }
    println(count)
  }

  val a1 = Array(12, 22, -25, 10, -10, 10,-50)
  count(a1)
}

