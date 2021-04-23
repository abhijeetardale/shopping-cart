import org.scalatest.{MustMatchers, WordSpec}

class CountFactorsSpec extends WordSpec with MustMatchers {

	"solution" should {

		"correct rotation with apple" in {

			CountFactors.solution("a2le", "2pl1") mustBe true

		}

		"correct rotation with ab10a" in {

			CountFactors.solution("a10", "10a") mustBe true

		}

		"correct rotation with 3x2x" in {

			CountFactors.solution("3x2x", "8") mustBe false

		}
//
//		"correct rotation with 94" in {
//
//			CountFactors.solution("789456123") mustBe 94
//
//		}
	}

}
