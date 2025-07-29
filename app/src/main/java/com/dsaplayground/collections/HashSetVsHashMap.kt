package com.dsaplayground.collections

fun main(){

    // HashSet
    val hashSet = HashSet<Int>()
    hashSet.add(1)
    hashSet.add(2)
    hashSet.add(3)

    println("Contains 2: ${hashSet.contains(2)}")

    for (element in hashSet) {
        println(element)
    }

    val iterator = hashSet.iterator()
    while (iterator.hasNext()) {
        println("Next element: ${iterator.next()}")
    }


    // HashMap
    val hashMap = HashMap<String, Int>()
    hashMap["apple"] = 1
    hashMap["banana"] = 2

    println("Value for apple: ${hashMap["apple"]}")

    for ((key, value) in hashMap) {
        println("$key -> $value")
    }

    hashMap.remove("apple")
}