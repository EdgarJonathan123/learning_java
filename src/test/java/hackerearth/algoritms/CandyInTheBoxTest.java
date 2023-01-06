package hackerearth.algoritms;

import hackerearth.algoritms.candyinthebox.CandyInTheBox;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CandyInTheBoxTest {


    @Test
    @DisplayName("test with 8 candies and 3 boxes")
    public void getIndexBoxWith8CandiesAnd3Boxes() {
        CandyInTheBox candyInTheBox = new CandyInTheBox(3,8);
        int expected = 2;
        int result =candyInTheBox.getIndexBox();
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("test with 2 candies and 5 boxes")
    public void getIndexBoxWith2CandiesAnd5Boxes() {
        CandyInTheBox candyInTheBox = new CandyInTheBox(5,2);
        int expected = 2;
        int result =candyInTheBox.getIndexBox();
        assertEquals(expected,result);
    }


    @Test
    @DisplayName("Test with 601432  Boxes and 369408325 Candies")
    public void getIndexBoxWith601432BoxesAnd369408325Candies(){
        CandyInTheBox candyInTheBox = new CandyInTheBox(601432,369408325);
        int expected = 129691;
        int result = candyInTheBox.getIndexBox();
        assertEquals(expected,result);
    }

}