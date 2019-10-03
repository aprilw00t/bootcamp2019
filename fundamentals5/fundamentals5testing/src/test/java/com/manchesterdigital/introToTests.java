package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.*;

public class introToTests {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testThatABankAccountTakesAnInputWhenDeposited() {
        //junit is a runner, an environment where you can run tests
    }

    @Test
    public void shouldTakeInputWhenDeposited() {

    }

    @Test
    public void givenBankAccountWhenInputThenDeposited() {
        //bdd style of writing tests
    }

    @Test
    public void shouldAddTwoNumbers() {
        //arrange
        int first = 23;
        int second = 23;
        //act
        int result = first + second;
        //assert
        assertThat(result).isEqualTo(46);
    }

    @Test
    public void whenCelciusIsOneFarenheitIs() {
        String first = "C";
        double second = 1;
        double result = ToTests.temperatureConverter(first, second);
        assertThat(result).isEqualTo(33.8);
    }//unit test
    @Test
    public void whenCelciusIsTwoFarenheitIs(){
        String first = "C";
                double second = 2;
        double result = ToTests.temperatureConverter(first, second);
        assertThat(result).isEqualTo(35.6);
    }
//----------------fahrenheit to celsius----------------------//

@Test
    public void whenFahrenheitIsZeroCelsiusIs17(){
    String first = "f";
    double second = 0;
    double result = ToTests.temperatureConverter(first, second);
    assertThat(result).isEqualTo(-17.77777777777778);
}
//can use @Test(expected = InvalidConversionUnitException.class)
@Test //edge case scenario
    public void whenConversionIsntVAlidExceptionIsThrown(){
       // expectedException.expect(InvalidConversionUnitException.class);
        double result = ToTests.temperatureConverter("oooop", 9);
//Assertions.assertThat(expectedException).isInstanceOf(InvalidConversionException.class);
    //
}

}