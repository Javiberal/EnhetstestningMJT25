package iths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TemperaturConverterTest {

    @Test
    void ceroCelTillFar(){
        double actual = TemperatureConverter.celsiusToFahrenheit(0);
        assertEquals(32.0, actual,"0°C should be 32°F");

    }

    @Test
    void tusenCelTillFar(){
        double actual = TemperatureConverter.celsiusToFahrenheit(100);
        assertEquals(212.0 ,actual,"100°C should be 212°F");

    }
     @Test
    void tretitwoFarTillCel(){
        double actual = TemperatureConverter.fahrenheitToCelsius(32);
        assertEquals(0, actual,"32°F should be 0°C");

    }
     @Test
    void roundTripConverted(){
        double original = 10.0;
        double converted = TemperatureConverter.celsiusToFahrenheit(original);
        double backToCelsius =TemperatureConverter.fahrenheitToCelsius(converted);
        assertEquals(original,backToCelsius,"Converting Celsius → Fahrenheit → Celsius should return approximately the same value"); 

    }

}


    
