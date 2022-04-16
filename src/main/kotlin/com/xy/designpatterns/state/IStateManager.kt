package com.xy.designpatterns.state

interface IStateManager {

    val state: IState?

    fun transitionState(event: String)
}