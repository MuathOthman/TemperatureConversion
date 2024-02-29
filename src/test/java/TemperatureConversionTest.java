import org.example.TemperatureConversion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TemperatureConversionTest {
    @Test
    public void testKelvinToFahrenheit() {
        assertEquals(59, TemperatureConversion.kelvinToFahrenheit(300.1));
    }
}