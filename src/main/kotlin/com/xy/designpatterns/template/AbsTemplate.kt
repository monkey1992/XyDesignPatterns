package com.xy.designpatterns.template

/**
 * 模板类
 */
abstract class AbsTemplate {

    fun templateMethod() {
        absMethodOne()
        absMethodTwo()
        absMethodThree()
    }

    abstract fun absMethodOne()

    abstract fun absMethodTwo()

    abstract fun absMethodThree()
}