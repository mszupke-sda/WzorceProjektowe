package prototyp;

public class Program {

    public static void main(String[] args) {
        int cellnumber = 0;

        SingleCellOrganism singlecell = new SingleCellOrganism(++cellnumber);

        Cell cell1 = singlecell.split(++cellnumber);
        Cell cell2 = singlecell.split(++cellnumber);
        Cell cell3 = singlecell.split(++cellnumber);
        Cell cell4 = singlecell.split(++cellnumber);
    }
}
