import org.scalatest.{MustMatchers, WordSpec}

class CyclicRotationSpec extends WordSpec with MustMatchers {

	"solution" should {

		"correct rotation with 1" in {

			CyclicRotation.solution(Array(1,2,3), 1) mustBe Array(1,2,3)

		}

		"correct rotation with 2" in {

			CyclicRotation.solution(Array(1,2,3), 2) mustBe Array(2,3,1)

		}

		"correct rotation with 3" in {

			CyclicRotation.solution(Array(1,2,3), 3) mustBe Array(3,2,1)

		}

		"correct rotation with 5" in {

			CyclicRotation.solution(Array(3, 8, 9, 7, 6), 3) mustBe Array(9, 7, 6, 3, 8)

		}
	}

}
