package com.xy.designpatterns.adapter.classdiagram.classadapter

import com.xy.designpatterns.adapter.classdiagram.ITarget
import com.xy.designpatterns.adapter.classdiagram.objectadapter.Adapter

/**
 * 适配器
 *
 * 通过继承[Adaptee]并实现[ITarget]，使[Adapter]拥有同时拥有[Adaptee]和[ITarget]的能力，
 * 从而将[ITarget]的具体实现转移到[Adaptee]类。
 */
class Adapter : Adaptee(), ITarget {

    override fun targetMethod() {
        // 访问父类[Adaptee]的method()方法
        // 将[ITarget]接口方法的具体实现转移到[Adaptee]类
        method()
    }
}