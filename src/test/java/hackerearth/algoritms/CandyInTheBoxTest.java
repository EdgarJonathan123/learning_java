package hackerearth.algoritms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CandyInTheBoxTest {

    CandyInTheBox candyInTheBox;

    @BeforeEach
    void setup(){
        candyInTheBox = new CandyInTheBox();
    }

    @Test
    @DisplayName("test with 8 candies and 3 boxes")
    void getIndexBoxWith8CandiesAnd3Boxes() {
        int expected = 2;
        int result =candyInTheBox.getIndexBox(3,8);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("test with 2 candies and 5 boxes")
    void getIndexBoxWith2CandiesAnd5Boxes() {
        int expected = 2;
        int result =candyInTheBox.getIndexBox(5,2);
        assertEquals(expected,result);
    }
}