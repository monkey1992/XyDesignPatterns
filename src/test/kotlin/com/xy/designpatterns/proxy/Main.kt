package com.xy.designpatterns.proxy

import com.xy.designpatterns.proxy.simulator.ProxyPatternSceneSimulator
import org.junit.jupiter.api.Test

/**
 * 代理模式测试类
 */
class Main {

    /**
     * 演示代理模式
     */
    @Test
    fun main() {
        ProxyPatternSceneSimulator.run()
    }
}