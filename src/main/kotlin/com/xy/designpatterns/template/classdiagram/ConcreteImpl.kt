package com.xy.designpatterns.template.classdiagram

/**
 * 具体类
 */
class ConcreteImpl : AbsTemplate() {

    override fun method1() {
        println("method1 invoked")
    }

    override fun method2() {
        println("method2 invoked")
    }

    override fun method3() {
        println("method3 invoked")
    }
}