package com.xy.designpatterns.proxy.classdiagram

import java.lang.reflect.Proxy

class Main {

    /**
     * 静态代理
     */
    private fun staticProxy() {
        val subject: Subject = ProxySubject(RealSubject())
        subject.method()
    }

    /**
     * 动态代理
     */
    private fun dynamicProxy() {
        val subject: Subject = RealSubject()
        val clazz = subject::class.java
        val proxy = Proxy.newProxyInstance(
            clazz.classLoader,
            clazz.interfaces,
            DynamicProxy(subject)
        ) as Subject
        proxy.method()
    }
}