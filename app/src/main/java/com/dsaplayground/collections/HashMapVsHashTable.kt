package com.dsaplayground.collections

import java.util.concurrent.ConcurrentHashMap

fun main(){

    // HashMap
    val hashMap = hashMapOf<String?, String?>()
    hashMap["name"] = "Manish"
    hashMap["email"] = "manish@example.com"
    hashMap["phone"] = null
    hashMap[null] = "Null Key"
    //println(hashMap)

    // HashTable
    val hashtable = java.util.Hashtable<String, String>()
    hashtable["name"] = "Manish"
    // hashtable[null] = "Null Key" // ❌ Throws NullPointerException
    // hashtable["email"] = null    // ❌ Throws NullPointerException
    //println(hashtable)

    // ConcurrentHashMap
    val concurrentMap = ConcurrentHashMap<String, String>()

    // Add entries
    concurrentMap["name"] = "Manish"
    concurrentMap["role"] = "Android Developer"

    // Read entry
    println(concurrentMap["name"]) // Output: Manish

    // Update entry safely
    concurrentMap.computeIfAbsent("location") { "Ahmedabad" }

    // Iterate over entries
    for ((key, value) in concurrentMap) {
        println("$key => $value")
    }

}