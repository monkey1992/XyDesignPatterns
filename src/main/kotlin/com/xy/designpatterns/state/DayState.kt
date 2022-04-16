package com.xy.designpatterns.state

/**
 * 白天状态
 */
class DayState : IState {

    init {
        run()
    }

    override fun run() {
        println("进入白天，吃饭、上班、运动！")
    }
}