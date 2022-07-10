package com.xy.designpatterns.iterator.classdiagram

class CollectionImpl<T> : Collection<T> {

    private val array: Array<T> = Array<T>()

    private val iterator: Iterator<T> by lazy { IteratorImpl(this) }

    override fun iterator(): Iterator<T> {
        return iterator
    }

    override fun add(t: T) {
        array = emptyArray()
    }
}