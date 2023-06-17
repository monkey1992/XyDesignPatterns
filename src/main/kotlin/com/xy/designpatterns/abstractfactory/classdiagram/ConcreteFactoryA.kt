package com.xy.designpatterns.abstractfactory.classdiagram

/**
 * 具体工厂 A
 */
class ConcreteFactoryA : Factory {
    override fun createProduct1(): ConcreteProductA1 {
        return ConcreteProductA1()
    }

    override fun createProduct2(): ConcreteProductA2 {
        return ConcreteProductA2()
    }

    override fun createProduct3(): ConcreteProductA3 {
        return ConcreteProductA3()
    }
}