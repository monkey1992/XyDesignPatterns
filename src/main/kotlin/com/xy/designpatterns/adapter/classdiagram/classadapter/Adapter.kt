package com.xy.designpatterns.adapter.classdiagram.classadapter

import com.xy.designpatterns.adapter.classdiagram.ITarget

/**
 * 适配器
 *
 * 通过继承[Adaptee]并同时实现[ITarget]，使适配器拥有同时拥有[Adaptee]和[ITarget]的能力，
 * 这样就能基于[Adaptee]现有的能力来实现目标接口定义的需求。
 */
class Adapter : Adaptee(), ITarget {

    override fun targetMethod() {
        method()
    }
}