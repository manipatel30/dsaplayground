package com.dsaplayground.collections

fun main(){

    // HashMap
    val hashMap = hashMapOf(
        3 to "C",
        1 to "A",
        2 to "B"
    )
    println(hashMap)


    // Tree Map
    val treeMap = java.util.TreeMap<Int, String>()
    treeMap[3] = "C"
    treeMap[1] = "A"
    treeMap[2] = "B"
    println(treeMap)
}