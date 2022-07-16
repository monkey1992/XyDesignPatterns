package com.xy.designpatterns.iterator.simulator

import com.xy.designpatterns.ISceneSimulator
import com.xy.designpatterns.iterator.classdiagram.Collection
import com.xy.designpatterns.iterator.classdiagram.CollectionImpl

/**
 * 迭代器模式场景模拟器
 */
class IteratorPatternSceneSimulator : ISceneSimulator {

    override fun run() {
        println("============迭代器模式示例============")
        val collection: Collection<String> = CollectionImpl()
        collection.add("A")
        collection.add("b")
        collection.add("c")
        collection.add("D")
        collection.add("E")
        collection.add("f")
        collection.add("g")
        collection.add("H")
        val iterator = collection.iterator()
        while (iterator.hasNext()) {
            val next = iterator.next()
            println("next is $next")
        }
        println("============迭代器模式示例============")
    }

    companion object {

        /**
         * 运行场景
         */
        fun run() {
            IteratorPatternSceneSimulator().run()
        }
    }
}