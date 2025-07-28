package com.dsaplayground.collections

fun main(){

    //Mutable map of
    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    println(solarSystem.size)
    solarSystem["Pluto"] = 5
    println(solarSystem.size)
    println(solarSystem["Pluto"])

    println(solarSystem["Theia"])

    solarSystem.remove("Pluto")
    println(solarSystem.size)

    solarSystem["Jupiter"] = 78
    println(solarSystem["Jupiter"])


    // immutable map and mutable map
    val desserts = hashMapOf("whipped cream" to "cake", "chocolate" to "cookie")
    println(desserts["chocolate"])
    if( desserts.isNotEmpty()) {
        println("desserts size is  ${desserts.size}" )
    }
   // contains key
    println(desserts.containsKey("chocolate")) //true

   // contains value
    println(desserts.containsValue("cake")) //true

   // contains key
    println(desserts.contains("chocolate")) //true
    println("chocolate" in desserts) //true

    val inventory = mutableMapOf("pancake" to 1)
    inventory.put("cake", 3)
    inventory.remove("pancake")
    if(inventory.isNotEmpty()) {
        println("inventory size is  ${inventory.size}" )
    }

    val readOnlyMap = mapOf(1 to "apple", 2 to "banana", 3 to "cherry")
    val mutableMap = mutableMapOf(1 to "apple", 2 to "banana", 3 to "cherry")
    mutableMap.put(4, "date")
    println(mutableMap)

    mutableMap.remove(2)
    println(mutableMap)

    val fruits = mutableMapOf(1 to "apple", 2 to "banana", 3 to "cherry")
    // below code explain use of loops
    for ((key, value) in readOnlyMap) {
        println("$key -> $value")
    }

     // below code explain use of for each
    readOnlyMap.forEach { (key, value) -> println("$key -> $value") }
}