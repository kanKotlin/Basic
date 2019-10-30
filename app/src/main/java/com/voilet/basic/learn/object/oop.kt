package com.voilet.basic.learn.`object`

fun main() {

}

internal class Bird(val weight:Double, val age:Int, private val color:String){
    //首次调用的时候初始化，之后不再改变
//    val sex by lazy {
//        if (color == "yellow") "male" else "female"
//    }
    lateinit var sex:String
    fun printSex(){
       this.sex = if (color == "yellow") "male" else "female"
    }
}

class Bird2(age: Int){

    val age:Int = age

    constructor(color: String):this(getAgebyColor(color))

}
//密封类
sealed class Bird3{
    open fun fly() = "I can fly"
    class test: Bird3()
}

private fun getAgebyColor(color: String): Int {
    return 1
}
