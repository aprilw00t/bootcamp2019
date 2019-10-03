package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class KBtoMBTest {

    @Test
    public void whenKBis1024MBis1(){
        String result = KBtoMB.KBtoMBConverter(1024);
        String expectedValue = "1MB, 0KB";
        Assertions.assertThat(result).isEqualTo(expectedValue);
    }
    @Test
    public void whenKNis1025MBis1andKBis1(){
        String result = KBtoMB.KBtoMBConverter(1025);
        String expectedValue = "1MB, 1KB";
        Assertions.assertThat(result).isEqualTo(expectedValue);
    }




}
