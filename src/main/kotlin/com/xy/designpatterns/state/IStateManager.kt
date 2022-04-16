package com.xy.designpatterns.state

/**
 * 状态管理接口
 */
interface IStateManager {

    /**
     * 当前状态
     */
    val state: IState?

    /**
     * 根据事件转换状态
     *
     * @param event 事件
     */
    fun transitionState(event: String)
}