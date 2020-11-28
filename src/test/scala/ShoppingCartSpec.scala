import org.scalatest.{MustMatchers, WordSpec}

class ShoppingCartSpec extends WordSpec with MustMatchers {

	val cart = ShoppingCart

	"ShoppingCart" when{

		"Calling apple price" must{

			"rerun £0.6 for an Apple" in {
				cart.applePrice(1) mustBe 0.6
			}

			"rerun £1.2 for two Apples" in {
				cart.applePrice(2) mustBe 1.2
			}
		}
	}

}
