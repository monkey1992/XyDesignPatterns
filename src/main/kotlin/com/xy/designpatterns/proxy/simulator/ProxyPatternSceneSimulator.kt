package com.xy.designpatterns.proxy.simulator

import com.xy.designpatterns.ISceneSimulator
import com.xy.designpatterns.iterator.classdiagram.Collection
import com.xy.designpatterns.iterator.classdiagram.CollectionImpl
import com.xy.designpatterns.proxy.classdiagram.Main

/**
 * 代理模式场景模拟器
 */
class ProxyPatternSceneSimulator : ISceneSimulator {

    override fun run() {
        val main = Main()
        println("============静态代理模式示例============")
        main.staticProxy()
        println("============静态代理模式示例============")
        println("============动态代理模式示例============")
        main.dynamicProxy()
        println("============动态代理模式示例============")
    }

    companion object {

        /**
         * 运行场景
         */
        fun run() {
            ProxyPatternSceneSimulator().run()
        }
    }
}