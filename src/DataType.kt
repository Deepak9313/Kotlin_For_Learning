/*
Data type (basic type) refers to type and size of data associated with variables and functions. Data type is used for declaration of memory location of variable which determines the features of data

Number
Character
Boolean
Array
String

Data Type           Bit Width (Size)                              Data Range
Byte                    8 bit                      -128 to 127
Short                  16 bit                      -32768 to 32767
Int                    32 bit                      -2,147,483,648 to 2,147,483,647
Long                   64 bit                      -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
Float                  32 bit                      1.40129846432481707e-45 to 3.40282346638528860e+38
Double                 64 bit                      4.94065645841246544e-324 to 1.79769313486231570e+308
Char                   4 bit                       -128 to 127
Boolean                1 bit                       true or false

The arrayOf() function creates array of wrapper types. The item value are passed inside arrayOf() function like arrayOf(1,2,3) which creates an array[1,2,3].

String is immutable you can't change the String after declaration
 */
fun main(args:Array<String>){
    var byteValue : Byte = 23;
    var shortValue : Short = 32;
    var intValue : Int = 0;
    var longValue : Long = 34L
    var floatValue : Float = 0.0f
    var doubleValue : Double = 67.909;
    var value1 = 'A'
    var value2 = true
    var id = arrayOf(1,2,3,4)
    var first = id[0]
    var second = id[id.size - 1]
    println(first)
}