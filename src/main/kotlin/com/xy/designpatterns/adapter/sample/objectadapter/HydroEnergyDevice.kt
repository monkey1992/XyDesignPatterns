package com.xy.designpatterns.adapter.sample.objectadapter

import com.xy.designpatterns.adapter.model.Energy
import com.xy.designpatterns.adapter.model.HydroEnergy

/**
 * 水能设备
 */
class HydroEnergyDevice {

    /**
     * 提供水能
     */
    fun inputHydroEnergy(): HydroEnergy {
        return HydroEnergy(Energy(hashCode().toString()))
    }

    companion object {

        const val LABEL = "【水能设备】"
    }
}