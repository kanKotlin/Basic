package com.voilet.basic.learn.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() {
//    GlobalScope.launch {
//        delay(1000)
//        println("测试协程")
//    }
    runBlocking {
        repeat(100){
            GlobalScope.launch {
                delay(10)
                println("测试协程")
            }
        }
    }
    println("主线程")
    Thread.sleep(100)
}

