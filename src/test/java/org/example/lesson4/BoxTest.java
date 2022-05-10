package org.example.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BoxTest {
    Box box;

    @Nested
    class WhenEmpty {
        @BeforeEach
        void initBox() {
            box = new Box();
        }

        @Test
        void exceptionWhenTryShuffleEmptyBox() {
            Assertions.assertThrows(ZeroBallsCountException.class, () -> box.shuffleBalls());
        }

        @Nested
        class WhenOneBall {
            @BeforeEach
            void addBall() {
                box.addBall();
            }

            @Test
            void deleteBoxTest() {
                box.removeBall();
                Assertions.assertEquals(box.getBallsCounter(), 0);
            }

            @Test
            void assertJExamplesTest() {
                List<String> strings = new ArrayList<>(Arrays.asList("test1", "test2", "test3"));

                assertThat(strings).containsAnyOf("test2", "test5").doesNotHaveDuplicates();
                assertThat(5).isLessThan(10).isGreaterThan(2);
            }



        }
    }
}
