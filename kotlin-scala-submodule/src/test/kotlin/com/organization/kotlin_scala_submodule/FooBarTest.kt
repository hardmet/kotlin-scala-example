package com.organization.kotlin_scala_submodule

import com.organization.kotlin_first.g
import com.organization.scala_first.Bar
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FooBarKtTest {
    @Test
    fun `Foo g accessible test`() {
        assertEquals(g(), "Foo.g called")
    }

    @Test
    fun `Bar g accessible test`() {
        assertEquals(Bar.g(), "Bar.g called")
    }
}
