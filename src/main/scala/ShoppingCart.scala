object ShoppingCart {

	def applePrice(numberOfItems: Int) : Double = {

		numberOfItems * 0.6
	}

	def orangePrice(numberOfItems: Int) : Double = {

		numberOfItems * 0.25
	}


	def checkout(items: List[String]) : String = {

		val result = if(items.contains("Apple")){
			applePrice(items.count(_=="Apple"))
		} else{
			0.0
		}

		s"£$result"
	}

}
