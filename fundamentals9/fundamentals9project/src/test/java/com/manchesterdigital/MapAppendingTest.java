package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapAppendingTest {

    MapChallenge mapChallenge;
    Map<String, String> originalMap;
    @Before
    public void setUp() {
        mapChallenge = new MapChallenge();
        originalMap = new HashMap<>();
    }

    @Test
    public void neitherAOrB() {
        //act
        Map<String, String> result = mapChallenge.appendAB(originalMap);
        //assert
        Assertions.assertThat(result).doesNotContainKeys("ab");
    }

    @Test
    public void doesntContainAButContainsB() {
        originalMap.put("b", "qwerty");
        //act
        Map<String, String> result = mapChallenge.appendAB(originalMap);
        //assert
        Assertions.assertThat(result).doesNotContainKeys("ab");
    }

    @Test
    public void doesntContainBButContainsA() {
        originalMap.put("a", "qrty");
        //act
        Map<String, String> result = mapChallenge.appendAB(originalMap);
        //assert
        Assertions.assertThat(result).doesNotContainKeys("ab");
    }

    @Test
    public void containsAANdB() {
        originalMap.put("a", "moo");
        originalMap.put("b", "cow");
        Map<String, String> result = mapChallenge.appendAB(originalMap);
        Assertions.assertThat(result).containsEntry("ab", "moocow");
    }
    @Test
    public void anotherContainsAANdB() {
        originalMap.put("a", "mo");
        originalMap.put("b", "co");
        Map<String, String> result = mapChallenge.appendAB(originalMap);
        Assertions.assertThat(result).containsEntry("ab", "moco");
    }

    @Test
    public void aAndBAndC() {
        originalMap.put("a","a");
        originalMap.put("b","bra");
        originalMap.put("c","cadabra");
        Map<String, String> result = mapChallenge.appendAB(originalMap);
        Assertions.assertThat(result).doesNotContainKeys("ab");
        Assertions.assertThat(result).doesNotContainKeys("abc");
    }

    @Test
    @Ignore
    public void aAndC() {
        originalMap.put("a","air");
        originalMap.put("c","conditioning");
        Map<String, String> result = mapChallenge.appendAB(originalMap);
        Assertions.assertThat(result).containsEntry("ac", "airconditioning");
    }
}
