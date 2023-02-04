package hackerearth.algoritms.candyinthebox;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CandyDispenserMachineTest {

    static CandyDispenserMachine candyDispenserMachine;

    @BeforeAll
    public static void setup(){
        candyDispenserMachine = new CandyDispenserMachineImplMath();
    }

    @Test
    @DisplayName("test with 8 candies and 3 boxes")
    public void getIndexBoxWith8CandiesAnd3Boxes() {
        int expected = 2;
        int result = candyDispenserMachine.findIndexBoxWhereIsLastCandy(2,8);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("test with 2 candies and 5 boxes")
    public void getIndexBoxWith2CandiesAnd5Boxes() {
        int expected = 2;
        int result =candyDispenserMachine.findIndexBoxWhereIsLastCandy(5,2);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("test with 5 candies and 3 boxes")
    public void getIndexBoxWith5CandiesAnd3Boxes() {
        int expected = 1;
        int result = candyDispenserMachine.findIndexBoxWhereIsLastCandy(3,5);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("test with 27 candies and 10 boxes")
    public void getIndexBoxWith27CandiesAnd10Boxes() {
        int expected = 9;
        int result = candyDispenserMachine.findIndexBoxWhereIsLastCandy(10,27);
        assertEquals(expected,result);
    }



    @Test
    @DisplayName("test with 50 candies and 6 boxes")
    public void getIndexBoxWith50CandiesAnd6Boxes() {
        int expected = 2;
        int result = candyDispenserMachine.findIndexBoxWhereIsLastCandy(6,50);
        assertEquals(expected,result);
    }



    @Test
    @DisplayName("Test with 601432  Boxes and 369408325 Candies")
    public void getIndexBoxWith601432BoxesAnd369408325Candies(){
        int expected = 129691;
        int result = candyDispenserMachine.findIndexBoxWhereIsLastCandy(601432,369408325);
        assertEquals(expected,result);
    }


}