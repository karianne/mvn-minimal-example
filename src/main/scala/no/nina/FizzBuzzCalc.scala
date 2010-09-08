package no.nina


class FizzBuzzCalc {

  def main(args : Array[String]) {
    println("test")
  }

  def valueOf(i : Int) : String = {
    (i % 3, i % 5) match {
      case (0,0) => "fizzbuzz"
      case (_,0) => "buzz"
      case (0,_) => "fizz"
      case _ => i.toString
    }

    /*
    if (i % 3 == 0 && i % 5 == 0) "fizzbuzz"
    else if (i % 3 == 0) "fizz"
    else if (i % 5 == 0) "buzz"
    else i.toString
    */
  }

}