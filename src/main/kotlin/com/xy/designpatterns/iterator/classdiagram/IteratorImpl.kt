package com.xy.designpatterns.iterator.classdiagram

class IteratorImpl<T>(private val collectionImpl: CollectionImpl<T>) : Iterator<T> {

    private var cursor: Int = 0

    override fun hasNext(): Boolean {
        if (cursor < collectionImpl.size()) {
            return true
        }
        return false
    }

    override fun next(): T {
        val item = collectionImpl[cursor]
        cursor++
        return item
    }
}