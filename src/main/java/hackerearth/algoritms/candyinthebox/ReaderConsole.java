package hackerearth.algoritms.candyinthebox;

import java.util.Scanner;

class ReaderConsole implements Reader {
    public void read() {
        Scanner in = new Scanner(System.in);

        Integer numberOfCases = 0;
        Integer counter = 0;
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
                CandyInTheBox candyInTheBox = new CandyInTheBox(lengthBoxes, lengthCandies);
                Integer result = candyInTheBox.getIndexBox();
                System.out.println(result);
            }

            counter++;
        }

    }

}
