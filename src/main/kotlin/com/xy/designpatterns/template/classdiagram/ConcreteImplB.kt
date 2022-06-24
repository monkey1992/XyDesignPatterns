package com.xy.designpatterns.template.classdiagram

/**
 * 具体类B
 * 实现抽象类中声明的抽象方法
 */
class ConcreteImplB : AbsTemplate() {

    override fun method1() {
        println("ConcreteImplB method1 invoked")
    }

    override fun method2() {
        println("ConcreteImplB method2 invoked")
    }

    override fun method3() {
        println("ConcreteImplB method3 invoked")
    }
}