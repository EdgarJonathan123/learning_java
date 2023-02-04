package hackerearth.algoritms.candyinthebox;

public class CandyDispenserMachineImplMath implements CandyDispenserMachine{

    private int K;
    private int N;
    @Override
    public int findIndexBoxWhereIsLastCandy(int lengthBoxes, int lengthCandies) {
        this.K = lengthCandies;
        this.N = lengthBoxes;

        if(K<= N){
            return K;
        }

        if(((K-N)/(N-1))%2==0){
            return N-(K-N)%(N-1);
        }else{
            return 1+(K-N)%(N-1);
        }
    }
}
