object OddOccurrencesInArray {

	def solution(a: Array[Int]): Int = {

		def rotate(output:Array[Int], element:Int): Int ={
			val x = output.filterNot(_==element)
			if(x.length%2!=0){
				rotate(x, x.head)
			} else element
		}
		rotate(a, a.head)
	}

}
