import scala.annotation.tailrec

object CyclicRotation {

	def solution(arr: Array[Int], k: Int): Array[Int] = {

		@tailrec
		def rotate(output:Array[Int], counter:Int): Array[Int] ={
			if(counter == k) {
				output
			} else {
				val res = output.reverse
				val res1 = Array(res.head) ++ res.tail.reverse
				rotate(res1, counter + 1)
			}
		}

		rotate(arr, 0)
	}

}
