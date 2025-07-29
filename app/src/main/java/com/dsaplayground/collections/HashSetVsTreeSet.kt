package com.dsaplayground.collections

fun main(){

    // HashSet
    val hashSet = hashSetOf("Banana", "Apple", "Mango", null)
    println(hashSet)

    val activeUsers = hashSetOf<String>()
    activeUsers.add("user1")
    activeUsers.add("user2")

    // TreeSet
    val treeSet = sortedSetOf("Banana", "Apple", "Mango")
    println(treeSet)

    val reverseSet = sortedSetOf(compareByDescending { it }, "Banana", "Apple", "Mango")
    println(reverseSet)

    val scores = sortedSetOf(95, 87, 100, 76)
    println(scores)

    val fruits = listOf("Orange", "Apple", "Banana")
    val sortedFruits = fruits.toSortedSet()
    println(sortedFruits)
}