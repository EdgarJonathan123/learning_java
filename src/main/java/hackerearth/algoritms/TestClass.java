package hackerearth.algoritms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer numberOfCases =Integer.valueOf(br.readLine());// Reading input from STDIN
        List<Integer[]> lineCases = new LinkedList<>();
        for (int i = 0; i < numberOfCases;i++){
            String[] caseLine =  br.readLine().split(" ");
            Integer lengthBox = Integer.valueOf(caseLine[0]);
            Integer lengthCandies = Integer.valueOf(caseLine[1]);;
            lineCases.add(new Integer[]{lengthBox,lengthCandies});
        }

        lineCases.forEach(linecase ->{
            Integer result = getIndexBox(linecase[0],linecase[1]);
            System.out.println(result);    // Writing output to STDOUT
        });
    }

    public static int getIndexBox(int lengthBox,int lengthCandy){
        return getIndexBox(1,1,lengthCandy,lengthBox,"asc");
    }
    private static int getIndexBox(int actualCandy, int actualBox, int lengthCandy, int lengthBox, String dir) {
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

}
