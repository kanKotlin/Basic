package com.voilet.basic.learn.syntax


/**
 * 中缀写法
 */
fun main(args: Array<String>) {
    mapOf(
        1 to "one",
        2 to "second"
    )
    val p = Person()
    p called "hhh"
    p.called("hhh")

    //字符串
}
//infix fun <A,B> A.to(that:B) :Pair<A,B> {
//
//}

class Person{

    infix fun called(name:String){
        println("my name is $name")
    }

}