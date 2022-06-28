import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Kyu4KtTest {

    @Test
    fun formatDuration() {
        // Example Test Cases
        assertEquals("1 second", formatDuration(1))
        assertEquals("1 minute and 2 seconds", formatDuration(62))
        assertEquals("2 minutes", formatDuration(120))
        assertEquals("1 hour", formatDuration(3600))
        assertEquals("1 hour, 1 minute and 2 seconds", formatDuration(3662))
    }
}