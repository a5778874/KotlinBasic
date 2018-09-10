package Demo2_kotlin函数

/**
 * 高阶函数，意思是 函数接收的参数包含函数，或者返回值是函数的 函数
 */

fun main(args: Array<String>) {
    say("你好", ::ChineseSay) // println：   中文说你好
    say("你好", ::EnglishSay) // println：  English say:你好

    //--------------------------------------
    var x =add1()
    x()         //1
    x()         //2
    x()         //3
    //-----------------
    add1()()   //1
    add1()()   //1
}

//------------高阶函数：接收函数参数---------------

// 接收一个字符串，和处理规则的函数Lambda表达式
fun say(s: String, printer: (String) -> Unit) {
    printer(s)
}

fun ChineseSay(s: String) {
    println("中文说" + s)

}

fun EnglishSay(s: String) {
    println("English say:" + s)
}

//---------------高阶函数：返回函数--------------------
//返回i+1
fun add1(): () -> Unit {
    var i = 0

    return fun() {
        println(++i)
    }

}