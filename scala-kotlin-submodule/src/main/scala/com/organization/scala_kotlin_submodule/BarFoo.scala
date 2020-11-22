package com.organization.scala_kotlin_submodule

import com.organization.kotlin_first.FooKt
import com.organization.scala_first.Bar

object BarFoo extends App {

  println("Hello world! scala kotlin edition")
  println(Bar.g())
  println(FooKt.g())
}
