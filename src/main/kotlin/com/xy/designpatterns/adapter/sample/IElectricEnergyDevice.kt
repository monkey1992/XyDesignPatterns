package com.xy.designpatterns.adapter.sample

import com.xy.designpatterns.adapter.model.ElectricEnergy

/**
 * 电能设备接口
 */
interface IElectricEnergyDevice {

    /**
     * 输出电能
     * @return 电能
     */
    fun outputElectricEnergy(): ElectricEnergy
}