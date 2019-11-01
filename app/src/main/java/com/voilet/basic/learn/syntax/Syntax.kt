package com.voilet.basic.learn.syntax

import androidx.databinding.ObservableField


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
    listOf(1, 2, 3).forEach { foo(it) }

    val arrayPerson = ArrayList<Person>()

    println(arrayPerson::class.java)

    val list = listOf(1, 2)

    println(list.fold(0, { x, y ->
        println(" x : $x y :$y")
        x * y
    }))

    val listPerson = listOf(Male(), Male())

//    println (listPerson.reduce { x: Person, y ->
//    })
    var name: Person = listPerson.reduce { x: Male, y: Person -> Male() }
    println(name.test)
}

//infix fun <A,B> A.to(that:B) :Pair<A,B> {
//
//}
fun reduse(pesion: Person, malez: Male): Person {
    return Person()
}


public inline fun <S, T : S> Iterable<T>.reduce(operation: (acc: S, T) -> S): S {
    val iterator = this.iterator()
    if (!iterator.hasNext()) throw UnsupportedOperationException("Empty collection can't be reduced.")
    var accumulator: S = iterator.next()
    while (iterator.hasNext()) {
        accumulator = operation(accumulator, iterator.next())
    }
    return accumulator
}

open class Person {

    val test = "hh"

    infix fun called(name: String) {
        println("my name is $name")
    }
}

class Male : Person() {}

fun foo(int: Int): Unit {
    println(int)
}

fun foo2(int: Int) = run { println(int) }