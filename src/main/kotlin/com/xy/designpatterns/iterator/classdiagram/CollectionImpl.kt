package com.xy.designpatterns.iterator.classdiagram

class CollectionImpl<T> : Collection<T> {

    private var array: Array<Any?> = emptyArray()

    override fun iterator(): Iterator<T> {
        return IteratorImpl(this)
    }
    override fun size(): Int {
        return array.size
    }

    override operator fun get(cursor: Int): T {
        @Suppress("UNCHECKED_CAST")
        return array[cursor] as T
    }
}