package com.manchesterdigital;
//
import org.assertj.core.api.Assertions;
import org.junit.Test;
//
//public class TestParkingCost {
//
//    @Test
//    public void whenTimeIsBetwen0And5AmCostOfParkingIs300(){
//
//        Assertions.assertThat(ParkingCost.calculateCost(0, "van")).isEqualTo(600);
//    }
//    @Test
//    public void whenTimeIsBetwen5And10AmCostOfParkingIs350(){
//
//        Assertions.assertThat(ParkingCost.calculateCost(6,"car")).isEqualTo(350);
//    }
//
//    @Test
//    public void whenTimeIsBetwen10amAnd3pmCostOfParkingIs500(){
//
//        Assertions.assertThat(ParkingCost.calculateCost(11,"car")).isEqualTo(500);
//    }
//    @Test
//    public void whenTimeIsBetwen3And8pmCostOfParkingIs700(){
//
//        Assertions.assertThat(ParkingCost.calculateCost(17,"car")).isEqualTo(700);
//    }
//    @Test
//    public void whenTimeIsBetwen8And0pmCostOfParkingIs400(){
//
//        Assertions.assertThat(ParkingCost.calculateCost(21,"car")).isEqualTo(400);
//    }
//}

public class TestParkingCostCar {
    @Test
    public void WhenNumberIs1NumeralIsI(){
        Integer number = 3;
        String result = "III";
        Assertions.assertThat(RomanNumerals.converstionToNumeral(number)).isEqualTo(result);
    }
    public void WhenNumberIs2NumeralIsII(){
        Integer number = 2;
        String result = "II";
        Assertions.assertThat(RomanNumerals.converstionToNumeral(number)).isEqualTo(result);
    }






//    @Test
//    public void WhenTimeIs0AmAnd5AmCostOfParkingIs300() {
//        // Arrange
//        Integer result = 0;
//        Integer expected = 300;
//        // Act
//        result = ParkingCost.calculateParkingCost(0.0, "car");
//        //Assert
//        Assertions.assertThat(result).isEqualTo(300);
//    }
//    @Test
//    public void WhenTimeIs5AmAnd10AmCostOfParkingIs350() {
//        // Arrange
//        Integer result = 0;
//        Integer expected = 300;
//        // Act
//        result = ParkingCost.calculateParkingCost(6, "car");
//        //Assert
//        Assertions.assertThat(result).isEqualTo(350);
//    }
//    @Test
//    public void WhenTimeIs10And15CostOfParkingIs500() {
//        // Arrange
//        Integer result = 0;
//        Integer expected = 300;
//        // Act
//        result = ParkingCost.calculateParkingCost(11, "car");
//        //Assert
//        Assertions.assertThat(result).isEqualTo(500);
//    }
//    @Test
//    public void WhenTimeIs15And20CostOfParkingIs700() {
//        // Arrange
//        Integer result = 0;
//        Integer expected = 300;
//        // Act
//        result = ParkingCost.calculateParkingCost(16, "car");
//        //Assert
//        Assertions.assertThat(result).isEqualTo(700);
//    }
//    @Test
//    public void WhenTimeIs20And24CostOfParkingIs400() {
//        // Arrange
//        Integer result = 0;
//        Integer expected = 300;
//        // Act
//        result = ParkingCost.calculateParkingCost(21, "car");
//        //Assert
//        Assertions.assertThat(result).isEqualTo(400);
//    }
}




