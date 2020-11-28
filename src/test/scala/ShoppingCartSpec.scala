import org.scalatest.{MustMatchers, WordSpec}

class ShoppingCartSpec extends WordSpec with MustMatchers {

	val cart = ShoppingCart

	"ShoppingCart" when {

		"Calling apple price" must {

			"return £0.6 for an Apple" in {
				cart.applePrice(1, false) mustBe 0.6
			}

			"return £1.2 for two Apples" in {
				cart.applePrice(2, false) mustBe 1.2
			}

			"return £0.6 for 2 Apples with an offer" in {
				cart.applePrice(2, true) mustBe 0.6
			}
		}

		"Calling orange price" must {

			"return £0.25 for an Orange" in {
				cart.orangePrice(1) mustBe 0.25
			}

			"return £0.25 for two Oranges" in {
				cart.orangePrice(2) mustBe 0.50
			}
		}

		"Calling checkout" must{

			"return 0 if cart is empty" in {

				cart.checkout(List.empty) mustBe "£0.0"
			}

			"return £1.2 if cart contains 2 Apples" in {

				cart.checkout(List("Apple", "Apple")) mustBe "£1.2"
			}

			"return £1.0 if cart contains 4 Oranges" in {

				cart.checkout(List("Orange", "Orange", "Orange", "Orange")) mustBe "£1.0"
			}

			"return £2.05 for list 0f Apple, Apple, Orange, Apple" in {

				ShoppingCart.checkout(List("Apple", "Apple", "Orange", "Apple")) mustBe "£2.05"
			}
		}
	}
}
