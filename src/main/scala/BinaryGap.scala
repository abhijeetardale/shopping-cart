import scala.annotation.tailrec

object BinaryGap {

	def binaryGap(num:Int): Int ={

		def gapStartCheck(gap: Int, last: Int, tail: List[Char]) = {
			if (gap > last) checkGap(tail, 1, gap) else checkGap(tail, 1, last)
		}

		def gapContinue(gap: Int, last: Int, tail: List[Char]) = {
			if (gap + 1 > last) checkGap(tail, 0, gap + 1) else checkGap(tail, 0, last)
		}

		def gapEndCheck(gap: Int, last: Int, tail: List[Char]) = {
			if (gap > last) checkGap(tail, 0, gap) else checkGap(tail, 0, last)
		}

		@tailrec
		def checkGap(binaryStr: List[Char], gap:Int, last:Int): Int ={
			binaryStr match {
				case Nil => last
				case '1' :: '1' :: tail => checkGap(tail, gap, last)
				case '1' :: '0' :: tail => gapStartCheck(gap, last, tail)
				case '0' :: '0' :: tail => checkGap(tail, gap + 2, last)
				case '0' :: '1' :: tail => gapContinue(gap, last, tail)
				case '1' :: tail => gapEndCheck(gap, last, tail)
				case '0' :: tail => checkGap(tail, gap + 1, last)
				case _ => last
			}
		}

		if(num > 0 && num < 648) checkGap(num.toBinaryString.toList, 0, 0) else 0

	}

}
