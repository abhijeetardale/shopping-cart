import scala.annotation.tailrec

object CountFactors {


 def solution(s: String, t: String): Boolean = {

  def scanString(str: String) = {
   val x = ("""\d+""".r findAllIn str).toList
   x.foldLeft(str)((a, b) => a.replaceFirst(b, "*" * b.toInt))
  }

  def compare(x: String, y: String, result: Boolean): Boolean = {
   if (x.isEmpty || y.isEmpty || (x.distinct == "*") || (y.distinct == "*")) {
    result
   }
   else {
    if (x.head.toString == "*" || y.head.toString == "*") {
     compare(x.tail, y.tail, true)
    } else {
     val z  = x.head.isDigit || y.head.isDigit
     compare(x.tail, y.tail, result && (x.head == y.head))
    }
   }
  }

  def leadingZeros(myStr:String): Boolean ={
   ("""\d+""".r findAllIn myStr).toList.exists(_.startsWith("0"))
  }

  if(leadingZeros(s) || leadingZeros(t)){
   false
  } else {
   compare(scanString(s), scanString(t), false)
  }
 }



def solution4(s: String): Int = {

 def recursion(str:String, t:List[Int]):Int = {
  val r = str.splitAt(2)
  if(r._2.nonEmpty){
   recursion(str.splitAt(1)._2, t ++ List(r._1.toInt))
  }  else {
   val z = t ++ List(r._1.toInt)
   z.max
  }
 }
 if(s.startsWith("0")){
  0
 } else {
  recursion(s, List[Int]())
 }
}





 def solution1(a: Array[Int]): Int = {
  def recursion(a: Array[Int], num: Int, times: Int): Int = {
   if (times == a.length) num
   else if (a.contains(num)) recursion(a, num + 1, times + 1)
   else recursion(a, num, times + 1)
  }

  recursion(a, 1, 0)
 }


 def solution1(n: Int): Int = {
  def recursion(number: Int, count:Int): Int ={
   if(number==n) count+1
   else recursion(number+1, if(n%number==0) count+1 else count)
  }
  recursion(1,0)
 }

}
