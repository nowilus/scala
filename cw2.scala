object Demo {
   def main(args: Array[String]) {
		val products = Map("Chleb" -> 10, "Maslo" -> 5);
		println(products.map( { case(i,j) => (i,j*0.9) }))
   }
}