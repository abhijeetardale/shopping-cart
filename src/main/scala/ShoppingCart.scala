object ShoppingCart {

	def applePrice(numberOfItems: Int) : Double = {

		numberOfItems * 0.6
	}

	def orangePrice(numberOfItems: Int) : Double = {

		numberOfItems * 0.25
	}


	def checkout(items: List[String]) : String = {

		val result = items match {
			case _ if items.contains("Apple") => applePrice(items.count(_=="Apple"))
			case _ if items.contains("Orange") => orangePrice(items.count(_=="Orange"))
			case Nil => 0.0
		}

		s"£$result"
	}

}
