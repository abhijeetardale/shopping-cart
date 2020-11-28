object ShoppingCart {

	def applePrice(numberOfItems: Int) : Double = {

		numberOfItems * 0.6
	}

	def orangePrice(numberOfItems: Int) : Double = {

		numberOfItems * 0.25
	}


	def checkout(items: List[String]) : String = {
		"£0.0"
	}

}
