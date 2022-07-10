package com.xy.designpatterns.iterator.classdiagram

/**
 * 集合
 */
interface Collection<T> {

    fun iterator(): Iterator<T>

    fun add(t: T)

    fun size(): Int

    operator fun get(cursor: Int): T
}