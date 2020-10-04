package com.github.vshnv.interop

fun main() {
    //kotlin - kotlin usage
    val kotlinHuman = KHuman("Kotliner", 15)
    println("${kotlinHuman.name}--${kotlinHuman.age}")
    //kotlin - java usage
    val javaHuman = JHuman("JavaUser", 22)
    println("${javaHuman.name}--${kotlinHuman.age}")
}