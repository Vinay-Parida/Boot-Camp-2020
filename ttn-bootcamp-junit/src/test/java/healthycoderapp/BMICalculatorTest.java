package healthycoderapp;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    private String environment = "dev";

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After All");
    }

    @Nested
            //with Nested we can put all the test which uses the same method
    class IsDietRecommendedTest {
        @Test
        void should_return_true_when_dietRecommended() {
            //given
            double weight = 80;
            double height = 1.72;

            //when
            boolean recommended = BMICalculator.isDietRecommended(weight, height);

            //then
            assertTrue(recommended);
        }

//        @ParameterizedTest                                                //@ParameterizedTest Not working
//        @ValueSource(doubles = {80, 81,54,66,100})
//        void should_return_true_when_dietRecommendedWithParamaterize(double weightOfCoder) {
//            //given
//            double weight = weightOfCoder;
//            double height = 1.72;
//
//            //when
//            boolean recommended = BMICalculator.isDietRecommended(weight, height);
//
//            //then
//            assertTrue(recommended);
//        }

        @Test
        void should_return_false_when_dietNotRecommended() {
            //given
            double weight = 70;
            double height = 1.72;

            //when
            boolean recommended = BMICalculator.isDietRecommended(weight, height);

            //then
            assertFalse(recommended);
        }

        @Test
        void should_Throws_anException_when_heightisZero() {
            //given
            double weight = 70;
            double height = 0;
            //when
            Executable recommended = () -> BMICalculator.isDietRecommended(weight, height);

            //then
            assertThrows(ArithmeticException.class, recommended);
        }
    }

    @Nested
    class FindCoderWithWorstBMITests {
        @Test
        void should_ReturnCoderWithWorstBMI_When_CoderListNotEmpty() {
            //given

            List<Coder> coderList = new ArrayList<>();
            coderList.add(new Coder(1.8, 70));
            coderList.add(new Coder(1.65, 90));
            coderList.add(new Coder(1.5, 75));

            //when
            Coder coderWithWorstBMI = BMICalculator.findCoderWithWorstBMI(coderList);

            //then
            assertAll(
                    () -> assertEquals(1.5, coderWithWorstBMI.getHeight()),
                    () -> assertEquals(75, coderWithWorstBMI.getWeight())
            );
        }

        @Test
        void should_ReturnTrueWhen_CoderWithWorstBMI_completein500ms_With50000element_InCodersList() {
            // given
            List<Coder> coderList = new ArrayList<>();
            for (int i = 0; i < 50000; i++) {
                coderList.add(new Coder(1.0 + i, 75 + i));
            }

            //when
            Executable e = () -> BMICalculator.findCoderWithWorstBMI(coderList);

            //then
            assertTimeout(Duration.ofMillis(500), e);           //this gives true if the test execution is done before 500 ms

        }

        @Test
        void should_ReturnNullWorstBMI_When_CoderListIsEmpty() {
            //given
            List<Coder> coderList = new ArrayList<>();

            //when
            Coder coderWithWorstBMI = BMICalculator.findCoderWithWorstBMI(coderList);

            //then
            assertNull(coderWithWorstBMI);
        }
    }

    @Nested
    class GetBMIScoresTests {

        @Test
        void shoud_ReturnCorrectBMIScoreArray_When_CodersNotEmpty() {
            //given
            List<Coder> coderList = new ArrayList<>();
            coderList.add(new Coder(1.8, 70));
            coderList.add(new Coder(1.65, 90));
            coderList.add(new Coder(1.5, 75));
            double expected[] = {21.6, 33.06, 33.33};

            //when
            double[] bmiScores = BMICalculator.getBMIScores(coderList);

            //then
            assertArrayEquals(expected, bmiScores);
        }
    }


}

