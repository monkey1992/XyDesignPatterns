package com.xy.designpatterns.proxy.classdiagram

class RealSubject : Subject {
    override fun method() {
        print("RealSubject method invoked")
    }
}