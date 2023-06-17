package com.xy.designpatterns.proxy.classdiagram

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

class DynamicProxy(private val target: Any) : InvocationHandler {
    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any?>?): Any? {
        if (args.isNullOrEmpty()) {
            return method?.invoke(target)
        }
        return method?.invoke(target, args)
    }
}