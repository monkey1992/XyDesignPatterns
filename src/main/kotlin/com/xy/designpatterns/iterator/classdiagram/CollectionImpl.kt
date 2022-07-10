package com.xy.designpatterns.iterator.classdiagram

class CollectionImpl<T> : Collection<T> {

    private val array: Array<Any?> by lazy { arrayOf() }

    private val iterator: Iterator<T> by lazy { IteratorImpl(this) }

    override fun iterator(): Iterator<T> {
        return iterator
    }

    override fun add(t: T) {
        array[array.size] = t
    }

    override fun size(): Int {
        return array.size
    }

    override operator fun get(cursor: Int): T {
        return array[cursor] as T
    }
}