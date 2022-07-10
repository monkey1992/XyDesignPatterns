package com.xy.designpatterns.iterator.classdiagram

class IteratorImpl<T>(private val collectionImpl: CollectionImpl<T>) : Iterator<T> {

    val cursor: Int = -1

    override fun hasNext(): Boolean {
        if (cursor < collectionImpl) {
        }
        return false
    }

    override fun next(): T {

    }
}