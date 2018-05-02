object Demo {
   def main(args: Array[String]) {
      var a = 0;
      val Lista = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela");

		while (a < Lista.length) {
			println(Lista(a));
			a = a+1;
		}
   }
}