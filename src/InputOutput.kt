/*
Kotlin standard input output operations are performed to flow byte stream from input device (keyboard) to main memory and from main memory to output device (screen).

Kotlin output operation is performed using the standard methods print() and println(). Let's see an example

Difference between print() and println() methods:
print(): print() method is used to print values provided inside the method "()".
println(): println() method is used to print values provided inside the method "()" and moves cursor to the beginning of next line.

Kotlin has standard library function readLine() which is used for reads line of string input from standard input stream. It returns the line read or null. Let's see an example::

In Kotlin, the !! operator is officially called the not-null assertion operator.

Think of it as a "forced conversion." It is a way of telling the compiler: "I am 100% sure this variable is not null. If it is null, feel free to crash the program.
 */
import java.util.Scanner
fun main(args:Array<String>){
    println("Enter your name: ")
    val name : String = readLine()!!
    println("Enter your age: ")
    val age : Int = readLine()!!.toInt()
    // The !! forces the "maybe null" value into a "never null" type.
    println("Name is $name and age is $age")

    // You can use the Scanner class object also which you done in java
    val sc = Scanner(System.`in`)
    println("Enter your hobby: ")
    val hobby = sc.next()
    println("Your hobby is $hobby")
    var Quantity = Integer.valueOf(sc.nextInt())
    var Quality = String.format("%.2f", Quantity.toDouble())
    println("The quality is $Quality")

    // Single Line Comment
    /*
    Multi
    Line
    Comment
     */

}