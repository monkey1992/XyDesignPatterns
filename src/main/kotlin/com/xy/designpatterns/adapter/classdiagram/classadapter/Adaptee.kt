package com.xy.designpatterns.adapter.classdiagram.classadapter

/**
 * 被适配者，即需要被适配的类
 */
open class Adaptee {

    fun method() {
        println("method invoked")
    }
}