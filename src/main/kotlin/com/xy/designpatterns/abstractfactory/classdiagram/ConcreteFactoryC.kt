package com.xy.designpatterns.abstractfactory.classdiagram

/**
 * 具体工厂 C
 */
class ConcreteFactoryC : Factory {
    override fun createProduct1(): ConcreteProductC1 {
        return ConcreteProductC1()
    }

    override fun createProduct2(): ConcreteProductC2 {
        return ConcreteProductC2()
    }

    override fun createProduct3(): ConcreteProductC3 {
        return ConcreteProductC3()
    }
}