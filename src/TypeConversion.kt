/*
Type conversion is a process in which one data type variable is converted into another data type. In Kotlin, implicit conversion of smaller data type into larger data type is not supported (as it supports in java). For example Int cannot be assigned into Long or Double.


In Java
int value1 = 10;
long value2 = value1;  //Valid code

In Kotlin
var value1 = 10
val value2: Long = value1  //Compile error, type mismatch

However in Kotlin, conversion is done by explicit in which smaller data type is converted into larger data type and vice-versa. This is done by using helper function.


The list of helper functions used for numeric conversion in Kotlin is given below:

toByte()
toShort()
toInt()
toLong()
toFloat()
toDouble()
toChar()


Conversion                              Safety                              Result
Small to Large                      (Int to Long)               SafeValue remains identical.
Large to Small                      (Long to Int)               RiskyIf the value is > 2.1 billion, it will "wrap around" and give you a mathematically wrong number (overflow).
 */
fun main(srgs:Array<String>){
    var value1 = 10
    val var2: Long = value1.toLong();
    println("Values is $var2 and type is ${var2::class}")
    // We can also converse from larger data type to smaller data type.
    var var3 : Int = var2.toInt()
    println("Values is $var3 and type is ${var3::class}")
}