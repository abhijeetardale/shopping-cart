import org.scalatest.{MustMatchers, WordSpec}

class BinaryGapSpec extends WordSpec with MustMatchers {

	"toBinary" should {

		"correct binary conversion" in {

			BinaryGap.binaryGap(647) mustBe "1010000111"

		}
	}

}
