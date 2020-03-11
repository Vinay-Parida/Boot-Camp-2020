package com.im;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {

    private First first;

    @BeforeEach
    void setUp(){
        first = new First();
    }

    @Test
    void methodName(){
        // given

        //when

        //then
    }



    @Nested
    class ReplaceSubStringTests{
        @Test
        void should_Return_MainString_IfAnyEnteredString_IsNull(){
            // given
            String mainString = "Hello World";
            String subString = null;
            String replacementString = null;

            String expected = "Hello World";

            //when
            String response = first.replaceSubString(mainString, subString, replacementString);

            //then
            assertEquals(expected, response);
        }
        @Test
        void should_ReturnNewString_When_ReplaceWithSubString(){
            // given
            String mainString = "Hello World";
            String subString = "ll";
            String replacementString = "11";

            String expected = "He11o World";

            //when
            String response = first.replaceSubString(mainString, subString, replacementString);

            //then
            assertEquals(expected, response);
        }
    }

    @Nested
    class FilterEvenElementTests{
        @Test
        void should_Return_FilteredElement_When_FilteredElememnt(){
            // given
            List<Integer> integerList = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                integerList.add(i);
            }
            List<Integer> expected = Arrays.asList(1,3,5,7,9);

            //when
            List<Integer> response = first.filterEvenElements(integerList);

            //given
            assertIterableEquals(expected, response);
        }

        @Test
        void shoud_ThrowRuntimeEception_when_ListIsNull(){
            //given
            List<Integer> integerList= null;

            //when
            Executable e = () -> first.filterEvenElements(integerList);
            //then
            assertThrows(RuntimeException.class, e);
        }
    }

    @Nested
    class CalculateAverageTests{
        @Test
        void shoud_ThrowRuntimeEception_when_ListIsNull(){
            //given
            List<BigDecimal> integerList= null;

            //when
            Executable e = () -> first.calculateAverage(integerList);
            //then
            assertThrows(RuntimeException.class, e);
        }

        @Test
        void should_ThrowRuntimeException_If_ListisEmpty(){
            // given
            List<BigDecimal> bigDecimals = new ArrayList<>();

            //when
            Executable e = () -> first.calculateAverage(bigDecimals);

            //then
            assertThrows(RuntimeException.class, e);
        }

        @Test
        void should_Return_Average_when_CalculateAverage(){
            // given
            List<BigDecimal> values = new ArrayList<>();
            for (int i = 0; i <10 ; i++) {
                values.add(new BigDecimal(i));
            }
            BigDecimal expected = BigDecimal.valueOf(4.5);
            //when
            BigDecimal response = first.calculateAverage(values);

            //then
            assertEquals(expected, response);
        }
    }

    @Nested
    class IsPalindromeTest{
        @Test
        void should_ReturnTrue_When_IsPalindrome(){
            //given
            String s = "racecar";

            //when
            boolean isPalindrome = first.isPallindrome(s);

            //then
            assertTrue(isPalindrome);
        }

        @Test
        void should_False_If_IsNotPalindrom(){
            //given
            String s = "rvinay";

            //when
            boolean isPalindrome = first.isPallindrome(s);

            //then
            assertFalse(isPalindrome);
        }
    }

}