package hackerearth.algoritms.candyinthebox;

import java.util.Scanner;

class TestClass {
    public static void main(String[] args) {
       int number = 0;

        while(number-- >0){

        }

        Scanner in = new Scanner(System.in);
        int numberOfCases = 0;
        int counter = 0;

        if (in.hasNext()) {
            numberOfCases = in.nextInt();
        }

        while (in.hasNext()) {
            if (numberOfCases < counter) {
                break;
            }
            String line = in.nextLine();
            if (!line.equals("")) {
                String[] caseLine = line.split(" ");
                int lengthBoxes = Integer.parseInt(caseLine[0]);
                int lengthCandies = Integer.parseInt(caseLine[1]);
                Integer result = findIndexBoxWhereIsLastCandy(lengthBoxes, lengthCandies);
                System.out.println(result);
            }
            counter++;
        }
    }

    public static  int findIndexBoxWhereIsLastCandy(int N, int K) {
        if(K<= N) return K;
        if(((K-N)/(N-1))%2==0)
            return N-(K-N)%(N-1);
        else
            return 1+(K-N)%(N-1);
    }
}
