import java.io._

object Bank {
   def main(args: Array[String]) {
		val konto = new kontoBankowe(1000, false);
		println("Stan konta: " + konto.stanKontaBankowego)
		konto.wpłata(200);
		println("Stan konta: " + konto.stanKontaBankowego)
		konto.wyplata(1100);
		println("Stan konta: " + konto.stanKontaBankowego)
		
   }
}
class kontoBankowe(stanKontaWejsciowy:Int, czyWyzerować:Boolean) {

    var wyzerujKonto: Int = 0
	var stanKonta: Int = if(czyWyzerować) 0 else stanKontaWejsciowy;
	
    def stanKontaBankowego: Int = stanKonta;
	
	

    def wpłata(ilosc: Int) {
      require(ilosc > 0)
      stanKonta += ilosc;
	  println("Wpłacono " + ilosc);
    }

    def wyplata(ilosc: Int) = 
      if (ilosc > stanKonta) println("Nie można wypłacić " + ilosc + "." + " Twój stan konta to: " + stanKonta)
      else {
        stanKonta -= ilosc
        println("Wypłacono " + ilosc)
      }
}
  
  