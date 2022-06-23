package com.xy.designpatterns.template.sample

/**
 * 小鱼
 */
class Fish : AbsAnimal() {

    override fun eat() {
        println("小鱼吃水草")
    }

    override fun move() {
        println("小鱼在水里游动")
    }

    override fun sleep() {
        println("小鱼钻进沙里睡觉")
    }
}