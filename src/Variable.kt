/*
Variables is used to store the data into a variable. A variable consist of many types we will see below :-

Kotlin variable is declared using keyword var and val.

var (Mutable variable): We can change the value of variable declared using var keyword later in the program.
val (Immutable variable): We cannot change the value of variable which is declared using val keyword.
 */
fun main(args: Array<String>) {
    var Salary = 40000;
    println("Salary Before Change :- $Salary")
    Salary = 20000;
    println("Salary After Change :- $Salary")
    val language = "Kotlin"
    println("Language Before Change :- $language")
    // language = "Java" -> throws error:- Kotlin: 'val' cannot be reassigned
    println("Language After Change :- $language")

}