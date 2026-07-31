/*
Kotlin, when expression is a conditional expression which returns the value. Kotlin, when expression is replacement of switch statement. Kotlin, when expression works as a switch statement of other language (Java, C++, C).

1) Using when as an Expression
  var numberProvided = when(number) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "invalid number"
    }

2) Using when Without Expression
when(number) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        else -> println("invalid number")
    }
3) Multiple Statement of when Using Braces
 when(number) {
        1 -> {
            println("Monday")
            println("First day of the week")
        }
        7 -> println("Sunday")
        else -> println("Other days")
    }
4) Multiple branches of when
when(number) {
        3, 4, 5, 6 ->
            println("It is summer season")
        7, 8, 9 ->
            println("It is rainy season")
        10, 11 ->
            println("It is autumn season")
        12, 1, 2 ->
            println("It is winter season")
        else -> println("invalid input")
    }
5) Using when in the range
when(number) {
        in 1..5 -> println("Input is provided in the range 1 to 5")
        in 6..10 -> println("Input is provided in the range 6 to 10")
        else -> println("none of the above")
    }  

 */
fun main(args:Array<String>){
    var number = 4
    var numberProvided = when(number) {
        1 -> {
            println("The number is 1")
        }
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5,6,7 -> {
            println("The number is $number")
        }
        else -> "invalid number"
    }
    println("You provide $numberProvided")
}