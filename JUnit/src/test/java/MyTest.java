
import com.lehuuhau.junit.DemoService;
import java.time.Duration;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author lehuu
 */
public class MyTest {

//    @Test
//    public void testOddNumber() {
//        int input = 2;
//        boolean expectedOutput = true;
//        boolean actualOutput = DemoService.isNt(input);
//
//        Assertions.assertEquals(expectedOutput, actualOutput);
//    }
//
//    @Test
//    public void testEvenNumber() {
//        int input = 3;
//        boolean expectedOutput = true;
//        boolean actualOutput = DemoService.isNt(input);
//
//        Assertions.assertEquals(expectedOutput, actualOutput);
//    }
//
//    @Test
//    public void testWrongNumber() {
//        int input = 4;
//        boolean expectedOutput = false;
//        boolean actualOutput = DemoService.isNt(input);
//
//        Assertions.assertEquals(expectedOutput, actualOutput);
//    }
//
//    @Test
//    public void testDuration() {
//        int input = 9999;
//
//        Assertions.assertTimeoutPreemptively(Duration.ofSeconds(2), () -> {
//            DemoService.isNt(input);
//        });
//    }
//
//    @Test
//    public void testException() {
//        int input = -10;
//
//        Assertions.assertThrows(ArithmeticException.class, () -> {
//            DemoService.isNt(input);
//        });
//    }

    @ParameterizedTest
    @CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
    public void testFile(int n, boolean expected) {
        Assertions.assertEquals(expected, DemoService.isNt(n));
    }
}
