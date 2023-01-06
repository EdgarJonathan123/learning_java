package hackerearth.algoritms.candyinthebox;

public class CandyInTheBox {
    private final int lengthCandy;
    private final int lengthBoxes;

    public CandyInTheBox(int lengthBoxes,int lengthCandy){
        this.lengthBoxes = lengthBoxes;
        this.lengthCandy = lengthCandy;
    }

    public int getIndexBox() {
        return getIndexBox(1, 1, lengthCandy, lengthBoxes, "asc");
    }

    private int getIndexBox(int actualCandy, int actualBox, int lengthCandy, int lengthBox, String dir) {
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


