import me.delete.JavaHelloWorld

class GroovyHello {
    static void main(String[] args) {
        println "hey ya"

        JavaHelloWorld javaHelloWorld = new JavaHelloWorld()
        javaHelloWorld.sayHello("this is from java")
    }
}
