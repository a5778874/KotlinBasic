package Demo3_面向对象

import java.awt.Color


/**
 * 类的执行流程  --  1.一级构造方法。 2.init代码块    3.二级构造方法
 */

//定义一个Car类

//class Car constructor(name: String)   : 一级构造函数，使用一级构造函数必须是有参数的，且二级构造函数不能定义无参数
class Car {

    lateinit var color: String   //lateinit 延迟初始化，类的成员变量不加lateinit且不立即初始化会报错

    //初始化代码块
    init {
        println("init........")
    }


    //二级无参数构造函数
    constructor()  {

    }

    //二级有参数构造函数
    constructor(color: String) {
        this.color = color
    }


    //定义函数方法
    fun drive() {
        println("开${color}车........")
    }

}


fun main(args: Array<String>) {
    val car = Car() //实例化对象
    car.color = "红色"
    car.drive()   // 调用对象中的方法
}