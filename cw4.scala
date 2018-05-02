object Demo {
    def main(args: Array[String]) {
		val Miasta = Map("Warszawa"-> 100, "Kraków"-> 50, "Wrocław"-> 20);
        println("show(Miasta.get( \"Warszawa\")) : " + show(Miasta.get( "Warszawa")) )
		println("show(Miasta.get( \"Kraków\")) : " + show(Miasta.get( "Kraków")) )
        println("show(Miasta.get( \"Toruń\")) : " + show(Miasta.get( "Toruń")) )
		
		def show(city: Option[Int]) = city match {
			case Some(liczba) => liczba
			case None => 0
		}		
	}
}