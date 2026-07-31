fun main(args:Array<String>){
    try{
    println("Enter your Age")
    var age : Int = readLine()!!.toInt()
    if(age < 18){
        println("You are too young")
    }else if(age <= 0){
        println("Invalid Age")
    }else if(age > 100){
        println("Too Old")
    }else{
        println("You are eligible for vote")
    }
    }catch(e:Exception){
        println("You Entered Wrong Format")
    }
    val num1 = 10
    val num2 =20
    val result = if (num1 > num2) "$num1 is greater than $num2" else "$num1 is smaller than $num2"
}