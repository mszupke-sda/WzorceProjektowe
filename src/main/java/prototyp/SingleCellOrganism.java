package prototyp;

public class SingleCellOrganism extends Cell {

    int cellnumber;

    public SingleCellOrganism(int CellNumber)
    {
        cellnumber = CellNumber;
        count();
    }

    public Cell split(int cellnumber) {
        return new SingleCellOrganism(cellnumber);
    }

    public void count()
    {
        System.out.println("Cell number: "+ cellnumber);
    }
}
