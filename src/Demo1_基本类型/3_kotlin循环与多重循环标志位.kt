package Demo1_基本类型

fun main(args: Array<String>) {

    //普通循环,区间[a,b]里逐渐递增
    for(i in 50..100 ){
        print("${i},")  //输出的是 50,51,52,...,99,100
    }

    println()


    //until代表区间[a,b)里逐渐递增
    for (i in 50 until 100){
        print("${i},")  //输出的是 50,51,52,...,99,
    }

    println()

    //downTo ：代表区间[a,b)里逐渐递减
    for (i in 50 downTo 0 ){
        print("${i},")  //输出的是50,49,48,...,3,2,1,
    }

    println()

    //step ： 每次循环递增的数量
    for (i in 50 ..100 step 3){
        print("${i},")  //输出的是50,53,56,...,92,95,98,
    }

    println()


    // Kotlin 中在多重循环时，可以通过标志位的方式来决定break或continue跳出的地方，使用 “标签名@”这样的方式命名标记在循环前面，跳出指定循环用“@标签名”。

    //列出X和Y从0..6可能组合的坐标。当Y坐标为5时，结束整个循环
    lo@ for (x in 0..6){

        for (y in 0..6){

            if (y==5) break@lo

            print("($x,$y),")  //输出 (0,0),(0,1),(0,2),(0,3),(0,4),
        }


    }


}