package com.organization.scala_second

import com.organization.kotlin_first.FooKt
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class BarBarSpec extends AnyFlatSpec with Matchers {

  "Foo.g" should "be accessible from BarBar" in {
    FooKt.g() shouldBe "Foo.g called"
  }
}
