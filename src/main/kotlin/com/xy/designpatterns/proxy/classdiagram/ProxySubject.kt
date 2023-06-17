package com.xy.designpatterns.proxy.classdiagram

class ProxySubject(private val realSubject: Subject) : Subject {
    override fun method() {
        realSubject.method()
    }
}