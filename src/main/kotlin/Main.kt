fun main(args:Array<String>) {
    val letter: Char
    letter ='A'
    println("$ letter")
}
fun raw(args: Array<String>){
    val escapedString : String="I am escaped String!\n"
    var rawString :String = "This is going to be a multi-lin string and willl"
    print(escapedString)
}
fun  fruits(args: Array<String>){
    val fruits= arrayOf<String>("Apple","Mango","Banana","Oranges")
    println(fruits[3])
    print(fruits[0])
}

fun Check(args: Array<String>){
    val fruits = arrayOf<String>("Apple","Mango","Banana")
     if ("Mango" in fruits){
         println("Mano exists in fruits")
     }else{
         println("Mango does not exist in fruits ")
     }
}
fun Empty(args: Array<String>){
    val fruits = arrayOf<String>()
    print("Array is empty:"+ fruits.isEmpty())

}

fun sumTwo(a:Int,b:Int){

    val x =a+b
    println(x)
}
fun factorial(a:Int):Int{
    val result:Int
    if(a<= 1){
        result = a

    }else{
        result = a* factorial(a-1)
    }
    return  result
}
fun upper(args: Array<String>){
    val UpperCase= {str: String -> str. toUpperCase()}
    println(UpperCase("hello,world!"))
}
