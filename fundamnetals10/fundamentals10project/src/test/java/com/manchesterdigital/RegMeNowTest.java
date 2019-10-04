package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.model.EachTestNotifier;
import org.junit.rules.ExpectedException;

public class RegMeNowTest {
    RegMeNow regMeNow;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    @Before
    public void setup() {
        regMeNow = new RegMeNow();
    }

    @Test
    public void noSpecialLetters() {
        //act
        String initialNumbers = "1234567";
        String result = regMeNow.registrationConverter(initialNumbers);
        //assert
        Assertions.assertThat(result).isEqualTo(initialNumbers);
    }

    @Test
    public void oneSpecialLetter() {
        String initialDigits = "1S34567";
        String result = regMeNow.registrationConverter(initialDigits);
        Assertions.assertThat(result).isEqualTo("1534567");
    }

    @Test
    public void allOneSpecialLetter() {
        String initialLetters = "SSSSSSS";
        String result = regMeNow.registrationConverter(initialLetters);
        Assertions.assertThat(result).isEqualTo("5555555");
    }

    @Test
    public void allSpecialLetters() {
        String initialLetters = "SAGBI";
        String result = regMeNow.registrationConverter(initialLetters);
        Assertions.assertThat(result).isEqualTo("54681");
    }

    @Test
    public void containsSpecialCharacters() {
        expectedException.expect(IllegalArgumentException.class);
        String initialLetters = "1234.";
        regMeNow.registrationConverter(initialLetters);
    }

    @Test
    public void tooShort() {
        expectedException.expect(IllegalArgumentException.class);
        String initialLetters = "1273";
        regMeNow.registrationConverter(initialLetters);
    }

    @Test
    public void tooLong() {
        expectedException.expect(IllegalArgumentException.class);
        String initialLetters ="12345678";
        regMeNow.registrationConverter(initialLetters);
    }

    @Test
    public void lowerCase() {
        expectedException.expect(IllegalArgumentException.class);
        String initialLetters ="opioop";
        regMeNow.registrationConverter(initialLetters);
    }
}
