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


	def checkout(items: List[String], applyOffer:Boolean) : String = {

		val result = items match {
			case Nil => 0.0
			case _ if !items.forall(item => item == "Apple" || item == "Orange") => throw new RuntimeException("Invalid Item")
			case _ => applePrice(items.count(_=="Apple"), applyOffer) + orangePrice(items.count(_=="Orange"), applyOffer)
		}

		s"£$result"
	}

}
