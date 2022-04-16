package com.xy.designpatterns.state

/**
 * 夜晚状态
 */
class NightState : IState {

    init {
        run()
    }

    override fun run() {
        println("进入夜晚，看电视、学习、睡觉！")
    }
}