package com.xy.designpatterns.template.sample

/**
 * 动物抽象类
 */
abstract class AbsAnimal {

    /**
     * 模板方法
     * 表示动物每天的生活
     */
    fun live() {
        eat()
        move()
        sleep()
    }

    /**
     * 吃东西
     */
    abstract fun eat()

    /**
     * 活动
     */
    abstract fun move()

    /**
     * 睡觉
     */
    abstract fun sleep()
}