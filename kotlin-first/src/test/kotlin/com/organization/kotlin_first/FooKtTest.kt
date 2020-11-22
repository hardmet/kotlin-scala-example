package com.organization.kotlin_first

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FooKtTest {
    @Test
    fun `g test`() {
        assertEquals(g(), "Foo.g called")
    }
}
