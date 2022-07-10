package com.xy.designpatterns.iterator.classdiagram

/**
 * 迭代器接口
 */
interface Iterator<T> {

    fun hasNext(): Boolean

    fun next(): T
}