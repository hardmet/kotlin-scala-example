package com.organization.scala_first

object Bar extends App {
  println("Hello world! scala first edition")

  def f(): Unit = println("Bar.f called")

  def g(): String = {
    println("Bar.g logged")
    "Bar.g called"
  }
}
