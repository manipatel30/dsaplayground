package com.dsaplayground.collections

fun main(){

    // Creating an immutable Set of strings
    val colors = setOf("Red", "Green", "Blue")
    println("Colors: $colors")

    // Creating an immutable Set of mixed types
    val mixedSet = setOf("Apple", 123, true, "Apple") // "Apple" will only appear once
    println("Mixed Set: $mixedSet")

    // Checking for element existence
    println("Contains 'Green': ${colors.contains("Green")}")
    println("Contains 'Yellow': ${colors.contains("Yellow")}")

    // Mutable set of
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    println(solarSystem.hashCode())

    solarSystem.add("Pluto")
    println(solarSystem.size)

    println(solarSystem.contains("Pluto"))

    solarSystem.remove("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))


    // immutable set and mutable set
    val colors2 = setOf("red", "blue", "yellow", "white")
    var miniColors = listOf("red", "blue")
    var result = colors2.containsAll(miniColors)
    println(result)

    val mutableColors = mutableSetOf("red", "blue", "yellow")
    mutableColors.add("pink")
    var mutableSetIteratorColors =  mutableColors.iterator()
    while (mutableSetIteratorColors.hasNext()) {
        println(mutableSetIteratorColors.next())
    }
}