package mate.academy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GetCenturyTest {

    @Test
    fun getCentury_YearInEarlyCentury_CorrectCentury() {
        // given
        val year = 1705

        // when
        val result = getCentury(year)

        // then
        assertEquals(18, result)
    }

    @Test
    fun getCentury_EndOfYearCentury_CorrectCentury() {
        // given
        val year = 1900

        // when
        val result = getCentury(year)

        // then
        assertEquals(19, result)
    }

    @Test
    fun getCentury_YearInMidCentury_CorrectCentury() {
        // given
        val year = 1601

        // when
        val result = getCentury(year)

        // then
        assertEquals(17, result)
    }

    @Test
    fun getCentury_YearAtCenturyBoundary_CorrectCentury() {
        // given
        val year = 2000

        // when
        val result = getCentury(year)

        // then
        assertEquals(20, result)
    }

    @Test
    fun getCentury_FirstYearOfFirstCentury_FirstCentury() {
        // given
        val year = 1

        // when
        val result = getCentury(year)

        // then
        assertEquals(1, result)
    }

    @Test
    fun getCentury_LastYearOfFirstCentury_FirstCentury() {
        // given
        val year = 100

        // when
        val result = getCentury(year)

        // then
        assertEquals(1, result)
    }
}
