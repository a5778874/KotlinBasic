package Demo1_基本类型

fun main(args: Array<String>) {
    var a1: String = " "  //a1有一个空格的空字符串
    var a2: String = ""  // a2空字符串

    var a3: String? =null //定义一个字符串变量为null，必须使用？定义可空，否则会编译期间就报错

    println(a1.isNullOrBlank())  //true
    println(a1.isNullOrEmpty())  //false
    println(a1.isEmpty())       //false    isEmpty：只有 不含内容 或 不含多个空格 的字符串会返回true
    println(a1.isBlank())       //true     isEmpty：只有 不含内容 才会返回true

    println(a2.isNullOrBlank()) //true
    println(a2.isNullOrEmpty()) //true
    println(a2.isEmpty())       //true
    println(a2.isBlank())       //true


}
