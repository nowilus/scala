object Demo {
   def main(args: Array[String]) {
      val Lista = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela");
	  var Lista2 = List("test");
	  var a = 0;
      for( a <- Lista){
		if(a.startsWith("P")){
			Lista2 :+ a;
			println(a)
		} 
      }
	  println(s"Dni tygodnia = ${Lista2.foldLeft("")((a, b) => a + " " + b )}")
	
   }
}