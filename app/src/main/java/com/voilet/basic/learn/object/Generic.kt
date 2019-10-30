package com.voilet.basic.learn.`object`

import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

/**
 * 泛型系统
 * 最关键的协变和逆变，好烦
 */
fun main() {

    //第一种
    //利用匿名内部类来获取泛型擦除后的类型
    // 匿名内部类在初始化的时候就绑定了父类的相应信息
    val gt = object :GenericsToken<Map<String,String>>(){
    }
    println(gt.type)
    //第二种，内联函数,知名T的实体类

}

open class GenericsToken<T> {
    var type : Type = Any::class.java
    init {
        val supperClass = this.javaClass.genericSuperclass
        type = (supperClass as ParameterizedType).actualTypeArguments[0]
    }
}

inline fun <reified T> getType(): Class<T> {
    return T::class.java
}