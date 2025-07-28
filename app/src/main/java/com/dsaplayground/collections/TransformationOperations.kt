package com.dsaplayground.collections

fun main(){
    // Example: Using map to Convert List of Integers to List of Strings
    val numbers = listOf(1, 2, 3, 4, 5)
    val strings = numbers.map { "Number $it" }
    //println(strings)

    // Example: Using flatMap to Flatten Lists of Lists
    val listOfLists = listOf(listOf(1, 2), listOf(3, 4), listOf(5, 6))
    val flattenedList = listOfLists.flatMap { it }
    //println(flattenedList)

    // Example: Using distinct to Remove Duplicate Elements from List
    val numbersWithDuplicates = listOf(1, 2, 3, 2, 4, 3, 5)
    val distinctNumbers = numbersWithDuplicates.distinct()
    //println(distinctNumbers)

    // Example: Using associateBy -
    /** associateBy: When multiple elements in the collection produce the same key,
     * associateBy will only keep the last element encountered for that key.
     * The previous elements with the same key are effectively overwritten.
     */
    val words = listOf("apple", "banana", "cherry")
    val mapByLength = words.associateBy { it.length }
    println(mapByLength)

    // Example: Grouping Strings by First Letter
    /** groupBy: When multiple elements produce the same key,
     * groupBy collects all these elements into a List associated with that key.
     * **/
    val groupedByFirstLetter = words.groupBy { it.first() }
    println(groupedByFirstLetter)

    for((key,value) in groupedByFirstLetter){
        println("Key: $key, Value: $value")
    }
}