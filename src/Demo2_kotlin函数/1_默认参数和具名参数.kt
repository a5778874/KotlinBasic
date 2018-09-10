package Demo2_kotlin函数


fun main(args: Array<String>) {
    sayHello()                  //println：你好呀
    sayHello("早上好")    //println：早上好

    sayHelloTo()                  //println：你好呀,小明
    sayHelloTo("早上好")    //println： 早上好,小明
    sayHelloTo(who = "小红")     //通过具名参数的方式传值。 println： 你好呀,小红


}

//方法中的变量可设置默认参数，不传参数会默认用默认参数
fun sayHello(text: String="你好呀") {
    println(text)
}



//含有多个默认参数，传入参数的顺序必须从左往右。
// 要想指定某个参数的值，使用 “具名参数”的方式传参
fun sayHelloTo(text: String="你好呀",who: String="小明") {
    println("$text,$who")
}
