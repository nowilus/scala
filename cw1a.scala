object Demo {
   def main(args: Array[String]) {
      var a = 0;
      val Lista = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela");

      for( a <- Lista){
         println(a);
      }
   }
}