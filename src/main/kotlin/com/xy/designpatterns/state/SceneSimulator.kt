package com.xy.designpatterns.state

import com.xy.designpatterns.ISceneSimulator
import java.util.*
import java.util.concurrent.CountDownLatch

/**
 * 状态模式场景模拟器
 *
 * 通过定时任务模拟一天24小时变化，1秒表示1小时，6点日出，转换为白天状态，18点日落，转换为夜晚状态
 */
class StatePatternSceneSimulator : ISceneSimulator {

    /**
     * 状态管理接口实例
     */
    private val stateManager: IStateManager by lazy { StateManager() }

    /**
     * 当前时间，即几点
     */
    private var time: Int = 0

    override fun run() {
        val countDownLatch = CountDownLatch(240)
        val timer = Timer()
        timer.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                println("现在是 $time 点")
                if (time == 6) {
                    // 6点日出，转换为白天状态
                    stateManager.transitionState(STATE_EVENT_SUNRISE)
                } else if (time == 18) {
                    // 18点日落，转换为夜晚状态
                    stateManager.transitionState(STATE_EVENT_SUNSET)
                }
                if (time < 23) {
                    time++
                } else {
                    time = 0
                }
                countDownLatch.countDown()
            }
        }, 0, 1000)
        countDownLatch.await()
    }

    companion object {

        /**
         * 运行场景
         */
        fun run() {
            StatePatternSceneSimulator().run()
        }
    }
}