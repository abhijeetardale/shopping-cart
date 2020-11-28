object ShoppingCart {

	def applePrice(numberOfItems: Int, offer:Boolean) : Double = {
		if(offer) {
			(numberOfItems / 2 * 0.6) + (numberOfItems % 2 * 0.6)
		} else {
			numberOfItems * 0.6
		}
	}

	def orangePrice(numberOfItems: Int, offer:Boolean) : Double = {
		if(offer) {
			(numberOfItems / 3 * 0.5) + (numberOfItems % 3 * 0.25)
		} else {
			numberOfItems * 0.25
		}
	}


	def checkout(items: List[String]) : String = {

		val result = if(items.nonEmpty) {
			applePrice(items.count(_=="Apple"), offer = false) + orangePrice(items.count(_=="Orange"), offer = false)
		} else {
			0.0
		}

		s"£$result"
	}

}
