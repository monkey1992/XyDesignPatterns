package com.xy.designpatterns.factorymethod.classdiagram

/**
 * 具体工厂 A
 */
class ConcreteFactoryA : Factory {
    override fun create(): ConcreteProductA {
        return ConcreteProductA()
    }
}