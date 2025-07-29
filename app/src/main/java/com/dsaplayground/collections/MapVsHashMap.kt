package com.dsaplayground.collections

// https://developermemos.com/posts/hashmap-vs-map-kotlin
fun main(){

    // HashMap
    val userAges = hashMapOf("John" to 30, "Alice" to 25, "Bob" to 35)
    // Adding a new entry
    userAges["Eve"] = 28
    // Updating an existing entry
    userAges["John"] = 31

    for ((name, age) in userAges) {
        println("$name is $age years old")
    }

    // Map
    val userAges2 = mapOf("John" to 30, "Alice" to 25, "Bob" to 35)
    // This will not compile
    // userAges2["Eve"] = 28
}