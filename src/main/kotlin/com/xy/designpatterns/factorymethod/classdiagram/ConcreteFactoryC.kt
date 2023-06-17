package com.xy.designpatterns.factorymethod.classdiagram

/**
 * 具体工厂 C
 */
class ConcreteFactoryC : Factory {
    override fun create(): ConcreteProductC {
        return ConcreteProductC()
    }
}