package com.xy.designpatterns.adapter.classdiagram.objectadapter

import com.xy.designpatterns.adapter.classdiagram.ITarget

/**
 * 适配器
 *
 * 通过持有[Adaptee]对象并实现[ITarget]，使[Adapter]拥有[ITarget]的能力，并能够访问[Adaptee]对象公开出来的接口方法，
 * 从而将[ITarget]的具体实现委托给[Adaptee]对象。
 */
class Adapter : ITarget {

    private val adaptee: Adaptee by lazy { Adaptee() }

    override fun targetMethod() {
        // 调用[Adaptee]对象的method()方法
        // 将[ITarget]接口方法的具体实现委托给[Adapter]对象
        adaptee.method()
    }
}