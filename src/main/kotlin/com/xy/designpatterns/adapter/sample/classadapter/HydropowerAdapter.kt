package com.xy.designpatterns.adapter.sample.classadapter

import com.xy.designpatterns.adapter.model.ElectricEnergy
import com.xy.designpatterns.adapter.model.HydroEnergy
import com.xy.designpatterns.adapter.sample.IElectricEnergyDevice

/**
 * 水力发电适配器，即水力发电装置，将水能装换为电能
 */
class HydropowerAdapter : HydroEnergyDevice(), IElectricEnergyDevice {

    override fun outputElectricEnergy(): ElectricEnergy {
        val hydroEnergy = inputHydroEnergy()
        println("${LABEL}提供水能（$hydroEnergy）")
        val electricEnergy = electricEnergyToHydroEnergy(hydroEnergy)
        println("${LABEL}把水能（$hydroEnergy）转换成为电能（$electricEnergy）")
        println("${LABEL}输出电能（$electricEnergy）")
        return electricEnergy
    }

    /**
     * 将水能转化为电能
     */
    private fun electricEnergyToHydroEnergy(hydroEnergy: HydroEnergy): ElectricEnergy {
        return ElectricEnergy(hydroEnergy.energy)
    }

    private companion object {

        private const val LABEL = "【水力发电适配器】"
    }
}