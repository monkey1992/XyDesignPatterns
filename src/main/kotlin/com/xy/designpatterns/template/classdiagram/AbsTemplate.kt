package com.xy.designpatterns.template.classdiagram

/**
 * 抽象类
 * 负责定义程序框架
 */
abstract class AbsTemplate {

    /**
     * 模板方法
     * 通过模板方法定义程序执行流程
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