package Demo1_基本类型


//1.有参数定义
fun sum(a: Int, b: Int): Int {
    return a + b
}

//2.只有一行代码的函数可以直接等号类型推断
// $ 为引用字符串模版中的变量
//${ } 引用变量的表达式
fun sum2(a: Int, b: Int) = println("$a+$b=${a+b}")






fun main(args: Array<String>) {
    println(sum(1, 2))
    sum2(1,3)

    //字符串模版
    val str="123456a";
    println("${str}的字符串长度为${str.length}")

}

