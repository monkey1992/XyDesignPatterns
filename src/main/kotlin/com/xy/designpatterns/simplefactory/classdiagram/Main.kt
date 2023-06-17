package com.xy.designpatterns.simplefactory.classdiagram

class Main {

    private fun createProducts() {
        val factory = Factory()
        val productA = factory.create("ConcreteProductA")
        val productB = factory.create("ConcreteProductB")
        val productC = factory.create("ConcreteProductC")
    }
}