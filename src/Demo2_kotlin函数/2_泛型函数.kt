package Demo2_kotlin函数

fun main(args: Array<String>) {

    // 使用函数时，可以带泛型
    val append = append(1,2,3);
    append.forEach { println(it) }

}


//函数可以接受泛型定义
fun <T : Number> append(vararg param: T): MutableList<T> {
    val mutableListOf = mutableListOf<T>(*param);
    mutableListOf.removeAt(0)       // * 运算符用于数组展开
    return mutableListOf
}