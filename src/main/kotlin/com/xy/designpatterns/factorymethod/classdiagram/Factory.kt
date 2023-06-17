package com.xy.designpatterns.factorymethod.classdiagram

/**
 * 抽象工厂
 */
interface Factory {
    /**
     * 生产抽象产品
     * @return 抽象产品
     */
    fun create(): Product
}