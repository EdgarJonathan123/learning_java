package hackerearth.algoritms;

import java.util.Scanner;

class TestClass {
    public static void main(String args[]) throws Exception {
        readContent2();
    }
    public static void readContent2() {
        Scanner in = new Scanner(System.in);

        Integer nubmerOfCases = 0;
        Integer contador = 0;
        if (in.hasNext()) {
            nubmerOfCases = in.nextInt();
        }

        while (in.hasNext()) {
            if (nubmerOfCases < contador) {
                break;
            }
            String line = in.nextLine();
            if (!line.equals("")) {
                String[] caseLine = line.split(" ");
                int lengthBoxes = Integer.parseInt(caseLine[0]);
                int lengthCandies = Integer.parseInt(caseLine[1]);
                Integer result = getIndexBox(lengthBoxes, lengthCandies);
                System.out.println(result);
            }

            contador++;
        }
    }
    public static int getIndexBox(int lengthBox, int lengthCandy) {
        return getIndexBox(1, 1, lengthCandy, lengthBox, "asc");
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
        } else {
            return getIndexBox(actualCandy + 1, actualBox - 1, lengthCandy, lengthBox, "desc");
        }
    }

}
