//Worksheet are simpler to what we call a REPL session (Read Evaluate Print Loop)
val volume = 1000

//volume = 2000
//causes an error because val creates immutable objects
println("Volume is : $volume")

//List
var adds = List(1,3,5,7,9)
//Range
2 to 10
var y = true
val pi = 3.14159

val cubeCalculator = CubeCalculator
cubeCalculator.cube(3)
//println(x)
val hello = new Hello
println(hello.sayHello("Scala"))

def add(a:Int, b: Int) = a + b
add(4,9)

def substrate(a:Int, b:Int) = a - b
substrate(13,10)