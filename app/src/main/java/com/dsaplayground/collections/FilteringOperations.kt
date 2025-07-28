package com.dsaplayground.collections

fun main(){

    // Example: Using filter to Filter Out Odd Numbers from a List
    val numbers = listOf(1, 2, 3, 4, 5)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    //println(evenNumbers)

    // Example: Using filterNot to Filter Out Odd Numbers from a List
    val oddNumbers = numbers.filterNot { it % 2 == 0 }
    //println(oddNumbers)

    // Example: Using filterNotNull to Filter Nullable Elements from a List
    val nullableNumbers: List<Int?> = listOf(1, null, 3, null, 5)
    val nonNullNumbers = nullableNumbers.filterNotNull()
    //println(nonNullNumbers)

    // Example: Concatenating Lists - The plus operator (+) concatenates two collections.
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(4, 5, 6)
    val concatenatedList = list1 + list2
    //println(concatenatedList)

    // Example: Removing Elements from a List - The minus operator (-) removes elements of one collection from another.
    val list3 = listOf(1, 2, 3, 4, 5)
    val list4 = listOf(3, 4)
    val resultList = list3 - list4
    //println(resultList)

    // Example: Grouping Strings by Length - groupBy: Groups elements based on a key returned by the provided function.
    val words = listOf("apple", "banana", "cherry", "date")
    val groupedByLength = words.groupBy { it.length }
    //println(groupedByLength)

    // Retrieving Collection Part - subList: Returns a sublist of the original list.
    val numbers2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sublist = numbers2.subList(2, 5)
    //println(sublist)

    // Example: Retrieving the First Even Number
    val firstEven = numbers.first { it % 2 == 0 }
    //println(firstEven)

    // Example: Retrieving the Last Even Number
    val lastEven = numbers.last { it % 2 == 0 }
    //println(lastEven)

    // Example: Finding the First Number Greater Than 3
    val firstGreaterThan3 = numbers.find { it > 3 }
    //println(firstGreaterThan3)

    // Example: Finding the Maximum Element in a List
    val maxNumber = numbers2.maxOrNull()
    println(maxNumber)

    // Example: Finding the Minimum Element in a List
    val minNumber = numbers2.minOrNull()
    println(minNumber)

    // Example: Calculating the Sum of Elements in a List
    val sumOfNumbers = numbers.sum()
    println(sumOfNumbers)
}