package com.dsaplayground.collections

import java.util.Arrays

fun main(){

    val rockPlanets = arrayOf("Mercury","Venus","Earth","Mars")
    println(rockPlanets.contentToString())

    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    println(gasPlanets.contentToString())

    val solarSystem = rockPlanets + gasPlanets
    println(solarSystem.contentToString())

    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
    println(newSolarSystem.contentToString())


    //Primitive arrays
    val array = intArrayOf(1, 2, 3, 4, 5)
    println(array.contentToString())


    val array2 = listOf(10, 20, 30) // Works with Lists as well
    println(array2.joinToString(separator = " | ", prefix = "{", postfix = "}")) // Prints: {10 | 20 | 30}

    val intArray = intArrayOf(1, 2, 3)
    println(Arrays.toString(intArray))
}
