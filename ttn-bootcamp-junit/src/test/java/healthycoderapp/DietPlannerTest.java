package healthycoderapp;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.*;

class DietPlannerTest {

    private DietPlanner dietPlanner;

    @BeforeEach
    void setup(){
        this.dietPlanner = new DietPlanner(30,30,40);
        System.out.println("Before Each");
    }

    @AfterEach
    void setup2(){
        System.out.println("After Each");
    }

    @Test
    void should_returnCorrectDietPlan_When_CorrectCoder(){
        //given

        Coder coder = new Coder(1.82, 75.0, 26, Gender.MALE);
        DietPlan expected = new DietPlan(2202, 165, 73, 220);

        //when
        DietPlan actual = dietPlanner.calculateDiet(coder);

        //then
        assertAll(
                () -> assertEquals(expected.getCalories(), actual.getCalories()),
                () -> assertEquals(expected.getCarbohydrate(), actual.getCarbohydrate()),
                () -> assertEquals(expected.getProtein(), actual.getProtein()),
                () -> assertEquals(expected.getFat(), actual.getFat())
                );

    }
//
//    @RepeatedTest(10)                                                    // @RepeatedTest must only be used if the value inside the code changes
//    void repeatedTest_should_returnCorrectDietPlan_When_CorrectCoder(){
//        //given
//        Coder coder = new Coder(1.82, 75.0, 26, Gender.MALE);
//        DietPlan expected = new DietPlan(2202, 165, 73, 220);
//
//        //when
//        DietPlan actual = dietPlanner.calculateDiet(coder);
//
//        //then
//        assertAll(
//                () -> assertEquals(expected.getCalories(), actual.getCalories()),
//                () -> assertEquals(expected.getCarbohydrate(), actual.getCarbohydrate()),
//                () -> assertEquals(expected.getProtein(), actual.getProtein()),
//                () -> assertEquals(expected.getFat(), actual.getFat())
//        );
//
//    }


}