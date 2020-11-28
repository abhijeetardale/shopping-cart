import org.scalatest.{MustMatchers, WordSpec}

class ShoppingCartSpec extends WordSpec with MustMatchers {

	private val cart = ShoppingCart

	"ShoppingCart" when {

		"Calling apple price" must {

			"return £0.6 for an Apple" in {
				cart.applePrice(1, offer = false) mustBe 0.6
			}

			"return £1.2 for two Apples" in {
				cart.applePrice(2, offer = false) mustBe 1.2
			}

			"return £0.6 for 2 Apples with an offer" in {
				cart.applePrice(2, offer = true) mustBe 0.6
			}

			"rerun £1.2 for 3 Apples with an offer" in {
				cart.applePrice(3, offer = true) mustBe 1.2
			}

			"return £2.8 for list 0f Apple, Apple, Orange, Orange, Orange, Apple, Apple if no offer" in {

				cart.checkout(List("Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Apple"), applyOffer = false) mustBe "£2.8"
			}

			"return £2.8 for list 0f Apple, Apple, Orange, Orange, Orange, Apple, Apple if offer applied" in {

				cart.checkout(List("Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Apple"), applyOffer = true) mustBe "£1.95"
			}
		}

		"Calling orange price" must {

			"return £0.25 for an Orange" in {
				cart.orangePrice(1, offer = false) mustBe 0.25
			}

			"return £0.25 for two Oranges" in {
				cart.orangePrice(2, offer = false) mustBe 0.50
			}

			"rerun £0.50 for three Oranges with an offer" in {
				cart.orangePrice(3, offer = true) mustBe 0.50
			}

			"rerun £0.75 for 4 Oranges" in {
				cart.orangePrice(4, offer = true) mustBe 0.75
			}
		}

		"Calling checkout" must{

			"return 0 if cart is empty" in {

				cart.checkout(List.empty, applyOffer = false) mustBe "£0.0"
			}

			"return £1.2 if cart contains 2 Apples" in {

				cart.checkout(List("Apple", "Apple"), applyOffer = false) mustBe "£1.2"
			}

			"return £1.0 if cart contains 4 Oranges" in {

				cart.checkout(List("Orange", "Orange", "Orange", "Orange"), applyOffer = false) mustBe "£1.0"
			}

			"return £2.05 for list 0f Apple, Apple, Orange, Apple" in {

				cart.checkout(List("Apple", "Apple", "Orange", "Apple"), applyOffer = false) mustBe "£2.05"
			}
		}
	}
}
