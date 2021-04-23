import org.scalatest.{MustMatchers, WordSpec}

class OddOccurrencesInArraySpec extends WordSpec with MustMatchers {

		"solution" should {

			"correct odd occurrence with 2" in {

				OddOccurrencesInArray.solution(Array(1, 2, 1)) mustBe 2

			}

			"correct rotation with 1" in {

				OddOccurrencesInArray.solution(Array(9,3,9,3,9,7,9)) mustBe 7

			}
		}
}
