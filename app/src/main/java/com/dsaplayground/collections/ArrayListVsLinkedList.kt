package com.dsaplayground.collections

import java.util.LinkedList

fun main(){

    // Array List usage
    val arrayList = ArrayList<String>()
    arrayList.add("Android")
    arrayList.add("Development")
    arrayList[1] = "App Development"
    println(arrayList[0])
    println(arrayList[1])


    // LinkedList usage
    val linkedList = LinkedList<String>()
    linkedList.add("Android")
    linkedList.add("Development")
    linkedList.add(1, "App") 
    println(linkedList[0])
    println(linkedList[1])  
    println(linkedList[2])  
}