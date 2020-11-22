package com.organization.kotlin_scala_submodule

import com.organization.kotlin_first.g
import com.organization.scala_first.Bar

fun main(args: Array<String>) {
    println("Hello world! kotlin second edition")
    println(Bar.g())
    println(g())
}
