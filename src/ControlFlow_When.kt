/*
Kotlin, when expression is a conditional expression which returns the value. Kotlin, when expression is replacement of switch statement. Kotlin, when expression works as a switch statement of other language (Java, C++, C).
 */
fun main(args: Array<String>){
    var number = 4
    var numberProvided = when (number) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "Unknown"
    }
    println("You Provided the no : $numberProvided")

    // Using When Without Expression
    // It is not mandatory to use when as an expression, it can be used as normally as it used in other language.
    when(number) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        else -> println("Unknown")
    }
    // Multiple Statement of when Using Braces
    // We can use multiple statement enclosed within block of condition.
    when(number) {
        1 -> {
            println("Monday")
            println("First day of the week")
        }
        7 -> println("Sunday")
        else -> println("Other days")
    }
    // Multiple branches of when
    // We can use multiple branches of condition separated with a comma. It is used, when we need to run a same logic for multiple choices.
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
    // Using when in the range
    // The when expression also check the ranges of input provided in when condition. A range is created using .. (double dot) operator. The in operator is used to check if a value belongs to a range.
    when(number) {
        in 1..5 -> println("Input is provided in the range 1 to 5")
        in 6..10 -> println("Input is provided in the range 6 to 10")
        else -> println("none of the above")
    }
}