import java.io._

object Osoba {
   def main(args: Array[String]) {
		val osoba1 = new Osoba("Jan", "Kowalski");
		val osoba2 = new Osoba("Marek", "Hucz");
		val osoba3 = new Osoba("Tomasz", "Owal");
		val osoba4 = new Osoba("Krzysztof", "Paparuch");
		val osoba5 = new Osoba("Marcin", "Cug");
		println(osoba1.hello(osoba1));
		println(osoba2.hello(osoba2));
		println(osoba3.hello(osoba3));
		println(osoba4.hello(osoba4));
		println(osoba5.hello(osoba5));
   }
}
case class Osoba(Imie:String, Nazwisko:String) {
    def hello (osoba: Osoba) = osoba match {
		  case Osoba("Jan",_) => "Witaj Janku"
		  case Osoba("Marek",_) => "Czesc Maro"
		  case Osoba("Tomasz",_) => "Elo Tomek"
		  case Osoba("Krzysztof",_) => "Dzien dobry Panie Krzysztofie"
		  case _ => "Witaj nieznajomy"
   
   }
}
  
  