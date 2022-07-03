package demo

/**
 * @author ${user.name}
 */
object Main {

  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)

  def main(args : Array[String]): Unit = {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
    val options = new ParseOptions()
    options.parse(args)
  }

  def fib(i: Int): Int = i match {
    case 0 => 0
    case 1 => 1
    case _ => fib(i - 1) + fib(i - 2)
  }

}
