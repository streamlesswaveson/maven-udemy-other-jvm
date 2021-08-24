import me.delete.JavaHelloWorld

class HelloScala {
  def main(args: Array[String]): Unit = {
    val hi = new JavaHelloWorld
    println(hi.sayHello("hello from java"))
  }

}
