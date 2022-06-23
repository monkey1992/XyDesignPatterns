package com.xy.designpatterns.template.classdiagram

/**
 * 抽象类
 */
abstract class AbsTemplate {

    /**
     * 模板方法
     */
    fun templateMethod() {
        method1()
        method2()
        method3()
    }

    abstract fun method1()

    abstract fun method2()

    abstract fun method3()
}