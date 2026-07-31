/*
In Kotlin, if is an expression is which returns a value. It is used for control the flow of program structure. There is various type of if expression in Kotlin.

if-else expression
if-else if-else ladder expression
nested if expression
 */
fun main(args: Array<String>){
    println("Enter Your Name: ")
    var name = readLine()!!.trim().uppercase()
    println("Enter Middle Name: ")
    var middlename = readLine()!!.trim().uppercase()
    println("Enter Your Age: ")
    var age = readLine()!!.toInt()
    println("Your Name is $name $middlename")
    if(age > 18){
        println("Your Age is $age,Congratulations you are a voter")
    }else{
        println("Your Age is $age, You are not eligible to vote")
    }
}