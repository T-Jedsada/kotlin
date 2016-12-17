package com.wisdomlanna.www.kotlin

import junit.framework.Assert.assertEquals
import org.junit.Test

/**
 * Created by jedsada on 12/17/16.
 */
class CalculateTest {
    @Test
    fun plus() {
        assertEquals(95, Calculate.plus(5, 90))
    }
}