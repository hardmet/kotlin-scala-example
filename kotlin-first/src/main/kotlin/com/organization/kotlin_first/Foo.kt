package com.organization.kotlin_first

fun main(args: Array<String>) {
    println("Hello world! kotlin first edition")
}

fun f() {
    println("Foo.f called")
}

fun g(): String {
    println("Foo.g logged")
    return "Foo.g called"
}
