package com.xy.designpatterns.template.sample

/**
 * 小鸟
 */
class Bird : AbsAnimal() {

    override fun eat() {
        println("小鸟吃昆虫")
    }

    override fun move() {
        println("小鸟在天空飞翔")
    }

    override fun sleep() {
        println("小鸟在树上的鸟窝里面睡觉")
    }
}