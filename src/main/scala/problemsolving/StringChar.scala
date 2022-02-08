package problemsolving

object StringChar extends App {

  val ar = Array("Ajith1", "Kev", "Kevin", "manu", "Ajith97")

  for (j <- ar) {
    if (j.length > 5)
      println(j)
  }

}
