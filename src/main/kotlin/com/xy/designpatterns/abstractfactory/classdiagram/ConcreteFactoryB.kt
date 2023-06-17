package com.xy.designpatterns.abstractfactory.classdiagram

/**
 * 具体工厂 B
 */
class ConcreteFactoryB : Factory {
    override fun createProduct1(): ConcreteProductB1 {
        return ConcreteProductB1()
    }

    override fun createProduct2(): ConcreteProductB2 {
        return ConcreteProductB2()
    }

    override fun createProduct3(): ConcreteProductB3 {
        return ConcreteProductB3()
    }
}