package com.xy.designpatterns.template.classdiagram

/**
 * 具体类A
 * 实现抽象类中声明的抽象方法
 */
class ConcreteImplA : AbsTemplate() {

    override fun method1() {
        println("ConcreteImplA method1 invoked")
    }

    override fun method2() {
        println("ConcreteImplA method2 invoked")
    }

    override fun method3() {
        println("ConcreteImplA method3 invoked")
    }
}