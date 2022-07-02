package com.xy.designpatterns.adapter.simulator

import com.xy.designpatterns.ISceneSimulator
import com.xy.designpatterns.adapter.sample.IElectricEnergyDevice
import com.xy.designpatterns.adapter.sample.objectadapter.HydropowerAdapter

/**
 * 对象适配器模式场景模拟器
 */
class ObjectAdapterPatternSceneSimulator : ISceneSimulator {

    override fun run() {
        println("============对象适配器模式示例============")
        val electricEnergyDevice: IElectricEnergyDevice = HydropowerAdapter()
        electricEnergyDevice.outputElectricEnergy()
        println("============对象适配器模式示例============")
    }

    companion object {

        /**
         * 运行场景
         */
        fun run() {
            ObjectAdapterPatternSceneSimulator().run()
        }
    }
}