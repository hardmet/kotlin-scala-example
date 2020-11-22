package com.organization.kotlin_second

import com.organization.scala_first.Bar
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FooFooKtTest {
    @Test
    fun `scala bar g accessible test`() {
        assertEquals(Bar.g(), "Bar.g called")
    }
}
