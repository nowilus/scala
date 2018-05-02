object Demo {
   def main(args: Array[String]) {
      val Lista = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela");

	  def printList(a:List[String]) {
		  if (! a.isEmpty){
		      println(a.head)
			  printList(a.tail)
		  }
	  }
	  printList(Lista)	
   }
}