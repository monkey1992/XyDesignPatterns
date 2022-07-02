package com.xy.designpatterns.adapter.sample.classadapter

import com.xy.designpatterns.adapter.model.Energy
import com.xy.designpatterns.adapter.model.HydroEnergy

/**
 * 水能设备
 */
open class HydroEnergyDevice {

    /**
     * 提供水能
     */
    fun inputHydroEnergy(): HydroEnergy {
        return HydroEnergy(Energy(hashCode().toString()))
    }
}