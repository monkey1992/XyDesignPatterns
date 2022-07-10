package com.xy.designpatterns.iterator.classdiagram

/**
 * 集合
 */
interface Collection<T> {

    fun iterator(): Iterator

    fun add(t: T)
}