package com.xy.designpatterns.template.sample

/**
 * 狮子
 */
class Lion : AbsAnimal() {

    override fun eat() {
        println("狮子吃羚羊")
    }

    override fun move() {
        println("狮子在草原奔跑")
    }

    override fun sleep() {
        println("狮子趴在树下睡觉")
    }
}