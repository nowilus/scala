object Demo {
   def main(args: Array[String]) {
	  def LiczbyRzeczywiste(list: List[Int]): List[Int] = {
		list.filter(i => i >= -5).filter(i => i <= 12).map((i: Int) =>i match {
			  case i if i < 0 => i * (-1)
			  case _ => i
			})
	  }

	  val Liczby = List(4, -3, -9, 15, -5, 0, 12, -45)
	  val Reczywiste = LiczbyRzeczywiste(Liczby)
	  println(Reczywiste)
   }
}