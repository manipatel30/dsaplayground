package com.dsaplayground.collections

fun main(){

    //List - read only
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem)
    println(solarSystem.size)

    println(solarSystem[2])
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))

    for (planet in solarSystem) {
        println(planet)
    }


    //MutableList - add/remove is possible
    val solarSystem2 = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem2)
    solarSystem2.add("Pluto")
    solarSystem2.add(3, "Theia")

    solarSystem2[3] = "Future Moon"
    println(solarSystem2[3])
    println(solarSystem2[9])

    solarSystem2.removeAt(9)
    solarSystem2.remove("Future Moon")
    println(solarSystem2.contains("Pluto"))
    println("Future Moon" in solarSystem2)

    // immutable list and mutable list
    val numbersList = listOf("one", "two", "three")
    val mutableNumbersList = mutableListOf("one", "two", "three")

    // alter the list using add function
    mutableNumbersList.add("five")

    listOf(1, 5, 3).sum()  // => 9
    listOf("a", "b", "cc").sumBy { it.length } // => 4

    // operators
    val numberList2 = numbersList + "four"
    println(numberList2)
    val numbersListNoTwo = numberList2 - "two"
    println(numbersListNoTwo)

    //println(numbersListNoTwo::class) //class java.util.ArrayList
    //println(numbersListNoTwo.javaClass) //class java.util.ArrayList

    // listOfNotNull
    val notNulls = listOfNotNull(32, null, "one", null, 'd')
    println("Size = ${notNulls.size}")

    for (element in notNulls) {
        println(element)
    }

    println(listOf(1,2,3).average())

    //Transform a collection into a single result
    val numList = listOf(1, 2, 3, 4, 5)
    val result = numList.reduce { result, item ->
        result + item
    }
    print(result)
}