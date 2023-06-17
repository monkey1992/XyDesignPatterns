package com.xy.designpatterns.abstractfactory.classdiagram

/**
 * 抽象工厂
 */
interface Factory {
    /**
     * 生产抽象产品1
     * @return 抽象产品1
     */
    fun createProduct1(): Product1

    /**
     * 生产抽象产品2
     * @return 抽象产品2
     */
    fun createProduct2(): Product2

    /**
     * 生产抽象产品3
     * @return 抽象产品3
     */
    fun createProduct3(): Product3
}