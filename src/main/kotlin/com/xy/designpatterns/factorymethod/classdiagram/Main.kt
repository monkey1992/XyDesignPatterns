package com.xy.designpatterns.factorymethod.classdiagram

class Main {

    private fun createProducts() {
        val factoryA: Factory = ConcreteFactoryA()
        val productA: Product = factoryA.create()

        val factoryB: Factory = ConcreteFactoryB()
        val productB: Product = factoryB.create()

        val factoryC: Factory = ConcreteFactoryC()
        val productC: Product = factoryC.create()
    }
}