package com.xy.designpatterns.template

import com.xy.designpatterns.ISceneSimulator
import com.xy.designpatterns.template.sample.AbsAnimal
import com.xy.designpatterns.template.sample.Bird
import com.xy.designpatterns.template.sample.Fish
import com.xy.designpatterns.template.sample.Lion

/**
 * 模板模式场景模拟器
 */
class TemplatePatternSceneSimulator : ISceneSimulator {

    override fun run() {
        println("============模板模式示例============")
        println("Bird的生活：")
        val bird: AbsAnimal = Bird()
        bird.live()
        println("====================================")
        println("Fish的生活：")
        val fish: AbsAnimal = Fish()
        fish.live()
        println("====================================")
        println("Lion的生活：")
        val lion: AbsAnimal = Lion()
        lion.live()
        println("============模板模式示例============")
    }

    companion object {

        /**
         * 运行场景
         */
        fun run() {
            TemplatePatternSceneSimulator().run()
        }
    }
}