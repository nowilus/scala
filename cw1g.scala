object Demo {
   def main(args: Array[String]) {
      val Lista = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela");
	
	  println(s"Dni tygodnia = ${Lista.foldLeft("")((a, b) => a + " " + b )}")
	  println(s"Dni tygodnia = ${Lista.foldRight("")((a, b) => b + " " + a )}")
   }
}