package hackerearth.algoritms.candyinthebox;

import java.util.Scanner;

class ReaderConsole implements Reader {
    public void read() {
        CandyDispenserMachine candyDispenserMachine = new CandyDispenserMachineImplMath();
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
                Integer result = candyDispenserMachine.findIndexBoxWhereIsLastCandy(lengthBoxes, lengthCandies);
                System.out.println(result);
            }

            counter++;
        }

    }

}
