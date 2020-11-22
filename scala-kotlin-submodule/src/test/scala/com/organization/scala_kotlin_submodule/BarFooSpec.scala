package com.organization.scala_kotlin_submodule

import com.organization.kotlin_first.FooKt
import com.organization.scala_first.Bar
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class BarFooSpec extends AnyFlatSpec with Matchers {

  "Foo.g" should "be accessible from BarFoo" in {
    FooKt.g() shouldBe "Foo.g called"
  }

  "Bar.g" should "be accessible from BarFoo" in {
    Bar.g() shouldBe "Bar.g called"
  }
}
