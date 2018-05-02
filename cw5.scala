object Demo {
    def main(args: Array[String]) {
	   def dzienTygodnia(x: String): String = x match {
		  case "Poniedziałek" => "Praca"
		  case "Wtorek" => "Praca"
		  case "Środa" => "Praca"
		  case "Czwartek" => "Praca"
		  case "Piątek" => "Praca"
		  case "Sobota" => "Weekend"
		  case "Niedziela" => "Weekend"
		  case _ => "Nie ma takiego dnia!"
	   }
	   println(dzienTygodnia("Sobota"));
	}  
}