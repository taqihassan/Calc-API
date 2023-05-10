package at.technikum.slmcalcapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {
    @Test

    void sumTest1() {
        //Arrange
        CalculatorController calculatorController = new CalculatorController();

        int a = 5;
        int b = 4;

        //Act
        int result = calculatorController.sum(5, 4);

        //Assert
        assertEquals(9, calculatorController.sum(5, 4);


    }

}