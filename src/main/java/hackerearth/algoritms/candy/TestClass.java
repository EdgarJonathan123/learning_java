package hackerearth.algoritms.candy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {

    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i <n; i++) {
            String line = br.readLine();                // Reading input from STDIN
            String[] arr = line.split(" ");
            Integer N = Integer.valueOf(arr[0]);//boxes
            Integer K = Integer.valueOf(arr[1]);//candies
            int result = calcuteNumberOfBoxWithTheLastCandie(N,K);
            System.out.println(result);
        }
    }

    public static int calcuteNumberOfBoxWithTheLastCandie(Integer candies, Integer boxes){
        if(candies <= boxes){
            return candies;
        }

        //when candies > boxes
        int salida = (candies-boxes)/(boxes-1);




        return 0 ;
    }


}
