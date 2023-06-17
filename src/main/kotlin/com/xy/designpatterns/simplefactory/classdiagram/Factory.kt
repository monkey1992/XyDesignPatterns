package com.xy.designpatterns.simplefactory.classdiagram

/**
 * 工厂
 */
class Factory {
    /**
     * 生产具体产品
     * @param name 产品名称
     * @return 具体产品
     */
    fun create(name: String): Product {
        return when (name) {
            "ConcreteProductA" -> ConcreteProductA()
            "ConcreteProductB" -> ConcreteProductB()
            else -> ConcreteProductC()
        }
    }
}