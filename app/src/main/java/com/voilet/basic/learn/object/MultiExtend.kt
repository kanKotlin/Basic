package com.voilet.basic.learn.`object`

/**
 * 为了解决多继承的方案，本身kotlin
 * 不支持多继承,c++的骡子问题
 */
fun main() {
    val bird = Bird4(Flyer(),Eater())
    bird.fly()
    bird.eat()

    val testCopy = Copy(1.0,2,"fuck")
//    val testCopy2 = testCopy
//    testCopy2.color = "fuck the world"
//    println(testCopy.color)

    //需要用copy方法来修改data class 内部的内容，否则就是浅拷贝
    val testCopy3 = testCopy.copy(color = "fuck the world")
    println(testCopy.color + " changed test copy three " + testCopy3.color)
}

internal data class Copy(val weight:Double, val age:Int, var color:String)


//第一种用interface
//第二种内部类

/**
 * 内部类包含外部的引用，嵌套类没有外界访问权
 */
class Out {

    val name: String = "inner class to resolve multi extend"

    class InnerWrong {
        fun printlnName() {
            //编译错误
//            println("$name")
        }
    }

    inner class Inner {
        fun printlnName() {
            println("$name")
        }
    }
}
//委托方式，最简单的实现

internal interface CanFly {
    fun fly()
}

internal interface CanEat {
    fun eat()
}

internal class Flyer : CanFly {
    override fun fly() {
        println("fly")
    }
}

internal class Eater : CanEat {
    override fun eat() {
        println("eat")
    }
}

internal class Bird4(fly: CanFly, eat: CanEat) : CanFly by fly, CanEat by eat {

}