package hackerearth.algoritms.candyinthebox;

public class CandyDispenserImplRecursive implements CandyDispenserMachine{
    private int lengthCandies;
    private int lengthBoxes;
    private int actualCandy;
    private int actualBox;
    private String dir;

    @Override
    public int findIndexBoxWhereIsLastCandy(int lengthBoxes, int lengthCandies) {
        initValues(lengthBoxes,lengthCandies);
        return getIndexBoxWhereIsLastCandy();
    }

    private void initValues(int lengthBoxes, int lengthCandies) {
        this.lengthBoxes = lengthBoxes;
        this.lengthCandies = lengthCandies;
        this.actualCandy = 1;
        this.actualBox = 1;
        this.dir = "asc";
    }

    private int getIndexBoxWhereIsLastCandy() {
        if (isLastCandy()) {
            return getActualBox();
        }
        assignCandyInTheBox();
        return getIndexBoxWhereIsLastCandy();
    }
    public boolean isLastCandy() {
        return actualCandy == lengthCandies;
    }
    public int getActualBox() {
        return actualBox;
    }

    public void assignCandyInTheBox() {
        if (needChangeDir()) changeDir();

        if (dirIsAsc()) advanceBox();
        else backBox();
    }
    private boolean needChangeDir() {
        return needChangeDirToAsc() || needChangeDirToDesc();
    }
    private boolean needChangeDirToAsc(){
        return actualBox == 1 && dir.equals("desc");
    }
    private boolean needChangeDirToDesc(){
        return actualBox == lengthBoxes && dir.equals("asc");
    }
    private void changeDir() {
        dir = dir.equals("asc") ? "desc" : "asc";
    }
    public boolean dirIsAsc() {
        return dir.equals("asc");
    }

    private void advanceBox() {
        this.actualCandy++;
        this.actualBox++;
    }

    private void backBox() {
        this.actualCandy++;
        this.actualBox--;
    }
}


