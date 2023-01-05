package hackerearth.algoritms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CandyInTheBox {


    public static void main(String args[] ) throws Exception {
        //BufferedReader
        CandyInTheBox candyInTheBox = new CandyInTheBox();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer numberOfCases =Integer.valueOf(br.readLine());// Reading input from STDIN
        for (int i = 0; i < numberOfCases;i++){
            Integer lengthBox = getItem(br,0);
            Integer lengthCandies = getItem(br,1);
            Integer result = candyInTheBox.getIndexBox(lengthBox,lengthCandies);
            System.out.println(result);    // Writing output to STDOUT
        }
    }

    public int getIndexBox(int lengthBox,int lengthCandy){
        return getIndexBox(1,1,lengthCandy,lengthBox,"asc");
    }
    private  int getIndexBox(int actualCandy, int actualBox, int lengthCandy, int lengthBox, String dir) {
        if (actualCandy == lengthCandy) {
            return actualBox;
        }

        if (actualBox == lengthBox && dir.equals("asc")) {
            return getIndexBox(actualCandy + 1, actualBox - 1, lengthCandy, lengthBox, "desc");
        }

        if (actualBox == 1 && dir.equals("desc")) {
            return getIndexBox(actualCandy + 1, actualBox + 1, lengthCandy, lengthBox, "asc");
        }

        if (dir.equals("asc")) {
            return getIndexBox(actualCandy + 1, actualBox + 1, lengthCandy, lengthBox, "asc");
        }
        else {
            return getIndexBox(actualCandy + 1, actualBox - 1, lengthCandy, lengthBox, "desc");
        }
    }

    public static Integer getItem(BufferedReader br,Integer numberItem)throws IOException {
        String[] caseLine =  br.readLine().split(" ");
        return Integer.valueOf(caseLine[numberItem]);
    }


}
