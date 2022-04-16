package com.xy.designpatterns.state

/**
 * 状态管理类
 */
class StateManager : IStateManager {

    override var state: IState = IdleState()

    override fun transitionState(event: String) {
        state = when (event) {
            STATE_EVENT_SUNRISE -> DayState()
            STATE_EVENT_SUNSET -> NightState()
            else -> IdleState()
        }
    }
}