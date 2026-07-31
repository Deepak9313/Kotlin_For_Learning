/*

Kotlin for loop is used to iterate a part of program several times. It iterates through arrays, ranges, collections, or anything that provides for iterate. Kotlin for loop is equivalent to the foreach loop in languages like C#.

for(item in collection){
 // body of loop
 */
fun main(args:Array<String>){
    // Iterate Through array
    var marks = arrayOf(20,30,50,60)
    //If the body of for loop contains only one single line of statement, it is not necessary to enclose within curly braces {}.
    for(item in marks){
        println(item)
    }

    // Iterate through range
    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print(i)
    println()
    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)             // prints nothing
    println()
    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)
    println()
    print("for (i in 5 downTo 2) print(i) = ")
    for (i in 5 downTo 2) print(i)
    println()
    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)
    println()
    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print(i)

}