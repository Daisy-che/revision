fun main() {
    println(sum(a=4,b=6))
    println(greet("Daisy","Hello"))
    println(findLength("Hello World"))
    var addition= average(42,32)
    println(addition)
    println(capitalizeEven("KOtLin"))

    //println(average(2))
    var age = 25
    println(age)


    var age1 = 25
    var ageAsString = "25"
    println(ageAsString)


  var name="Daisy"
  var greeting="Hello,$name Nice to meet"
    println(greeting)

}
fun sum(a:Int,b:Int):Int{
    var sum = a+b
    return sum

}
fun greet(name:String, greeting:String):String{
    var name = "Daisy"
    var greeting= "Hello $name"
    return greeting

}
fun findLength(a:String):Int {
    if (a != null)
         a.length else 0
    return a.length
}
fun average( a:Int,b: Int):Int{
    var name=(a+b)/2
    return name
}




fun capitalizeEven(word:String): String {
    var capitalize="kOtLin"
    return capitalize

}

