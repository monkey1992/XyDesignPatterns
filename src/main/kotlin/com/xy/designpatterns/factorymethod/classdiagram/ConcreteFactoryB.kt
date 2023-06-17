package com.xy.designpatterns.factorymethod.classdiagram

/**
 * 具体工厂 B
 */
class ConcreteFactoryB : Factory {
    override fun create(): ConcreteProductB {
        return ConcreteProductB()
    }
}