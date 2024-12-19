package main

import spec.CyclicNumberRule
import spec.PassThroughRule
import core.NumberConverter


fun main() {
    val fizzrule: CyclicNumberRule = CyclicNumberRule(3, "Fizz")
    val buzzrule: CyclicNumberRule = CyclicNumberRule(5, "Buzz")
    val passthroughrule: PassThroughRule = PassThroughRule()
    val fizzbuzz: NumberConverter = NumberConverter(
        arrayOf(fizzrule,buzzrule,passthroughrule)
    )

    println(fizzbuzz.convert(15));
}