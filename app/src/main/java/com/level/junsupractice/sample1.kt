package com.level.junsupractice

fun main(){
    //3. String Template 변수를 출력하고자 할 경우에는 $를 활용하면 된다.
    forNwhile()
}

//1. function or method

fun helloWorld(){  //Unit 반환형이 경우는 생략 가능.
    println("Hello World!")
}

fun add(a : Int, b : Int) : Int {
    return a+b
}

/*2. val vs var, val = can't be reassigned. var = can be reassigned.
코틀린의 경우에는 변수형도 선언을 해줘야 하지만 val 과 var 을 변수 선언할 적에 작성해줌으로써 형태를 정해줘야한다.
*/

fun hi(){
    val a : Int = 10
    var b : Int = 9
}

//4.조건식
fun max(a : Int, b: Int) : Int {
    if(a > b){
        return a
    }
    else {
        return b
    }
}

fun max2(a : Int, b : Int) = if(a>b) a else b //코틀린은 삼항연산자가 없다. (a>b)? a:b <-이게 없다.

fun checkNum(score : Int){
    when(score) {   //코틀린에서 when은 타 언어에서 switch와 비슷하다. 훨씬 간결. 조건 많을 경우 사용하기에 좋음.
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2,3")
        else -> println("I don't know :(")
    }

    var b = when(score){    //이와 같이 return 변수에 곧장 사용도 가능하다. else문 필수적이다.
        1 ->1
        2 -> 2
        3 -> 3
        else -> 0
    }
}

// Expression vs Statement

//5. Array and List Array는 크기가 정해져있다. 또 값이 변경가능하다. List는 MutableList, List 두 종류가 있다.

fun array() {
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)
}

//6. for / while

fun forNwhile(){
    val students = arrayOf("a", "b", "c", "d")

    for(name in students){
        println(name)
    }
}