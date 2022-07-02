package com.xy.designpatterns.adapter.simulator

import com.xy.designpatterns.ISceneSimulator
import com.xy.designpatterns.adapter.sample.IElectricEnergyDevice
import com.xy.designpatterns.adapter.sample.classadapter.HydropowerAdapter

/**
 * 类适配器模式场景模拟器
 */
class ClassAdapterPatternSceneSimulator : ISceneSimulator {

    override fun run() {
        println("============类适配器模式示例============")
        val electricEnergyDevice: IElectricEnergyDevice = HydropowerAdapter()
        electricEnergyDevice.outputElectricEnergy()
        println("============类适配器模式示例============")
    }

    companion object {

        /**
         * 运行场景
         */
        fun run() {
            ClassAdapterPatternSceneSimulator().run()
        }
    }
}