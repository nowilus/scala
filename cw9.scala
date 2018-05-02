object Calkowite {
   def main(args: Array[String]) {
		var list = List(1,2,3,4,5,4,3,5,6,7,6,5,6,7);
		def plusOne (list: List[Int]): List[Int] = list.map(i=> i+1);
		
		var newList = plusOne(list);
		println(newList)
   }
}

  
  