object Calkowite {
   def main(args: Array[String]) {
	var list = List(1,2,3,4,5,6,7,8,5,4,6,0,8,0,9,8,9,0);
	
	def bezZer(list: List[Int]): List[Int] = list filterNot List(0).contains;
	
	var newList = bezZer(list);
	println(newList);
   }
}

  
  