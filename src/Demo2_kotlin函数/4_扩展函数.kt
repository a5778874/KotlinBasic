package Demo2_kotlin函数

//扩展函数 一般用在扩展 系统提供的类的函数，这样操作他们的对象可以轻松的使用自己自定义的方法

fun main(args: Array<String>) {
    "hello".toPrint()         //hello
    "go ".mutiPrint(5)  //go go go go go
}

//扩展String类的打印函数，直接调用toPrint直接打印

fun String.toPrint() {
    println(this)   //扩展函数的this，指的是调用者本身
}


//扩展String类,将字符串翻n倍输出
 fun String.mutiPrint(num: Int) {
    val sb = StringBuffer()
    for (i in 0 until num) {
        sb.append(this)
    }
    println(sb.toString())
}

