package com.xy.designpatterns.abstractfactory.classdiagram

class Main {

    private fun createProducts() {
        val factoryA: Factory = ConcreteFactoryA()
        val concreteProductA1 = factoryA.createProduct1()
        val concreteProductA2 = factoryA.createProduct2()
        val concreteProductA3 = factoryA.createProduct3()

        val factoryB: Factory = ConcreteFactoryB()
        val concreteProductB1 = factoryB.createProduct1()
        val concreteProductB2 = factoryB.createProduct2()
        val concreteProductB3 = factoryB.createProduct3()

        val factoryC: Factory = ConcreteFactoryC()
        val concreteProductC1 = factoryC.createProduct1()
        val concreteProductC2 = factoryC.createProduct2()
        val concreteProductC3 = factoryC.createProduct3()
    }
}