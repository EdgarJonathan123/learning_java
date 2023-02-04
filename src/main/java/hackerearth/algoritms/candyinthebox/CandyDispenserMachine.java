package hackerearth.algoritms.candyinthebox;

public interface CandyDispenserMachine {

    /**
     * @return the index of the box where the machine put the
     * K-th candy
     *Considering that the machine:
     *Having N boxes numbered 1 through N and K candies numbered 1
     *  <p>
     *through K. The Machine put the candies in the boxes in the following order:
     *<ul>
     *<li>first candy in the first box,
     *<li>second candy in the second box,
     *<li>.......
     *<li>........
     *<li>so up to N-th candy in the Nth box,
     *<li>the next candy in (N - 1)-th box,
     *<li>  the next candy in (N - 2)-th box
     *<li>........
     *<li>.......
     *<li>and so on up to the first box,
     *<li>then the next candy in the second box
     *<li>......    and so on until there is no candy left.
     *</ul>
     *
     * So the machine put the candies in the boxes in the following order:
     * <p>
     * 1,2,3...,N,N-1,N-2,...,2,1,2,3...,N,N-1,...
     *
     * @see <a href="https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/candy-in-the-box-1/">Candy in the box</a>
     */
    public int findIndexBoxWhereIsLastCandy(int lengthBoxes, int lengthCandies);
}
