package com.xy.designpatterns.proxy.classdiagram

class RealSubject : Subject {
    override fun method() {
        println("RealSubject method invoked")
    }
}