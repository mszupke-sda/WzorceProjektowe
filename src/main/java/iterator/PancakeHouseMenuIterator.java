package iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {

    ArrayList lista;
    int pozycja = 0;

    public PancakeHouseMenuIterator(ArrayList lista) {
        this.lista = lista;
    }

    public Object next() {
        Object object = lista.get(pozycja);
        pozycja = pozycja + 1;
        return object;
    }

    public boolean hasNext() {
        if (pozycja >= lista.size()) {
            return false;
        } else {
            return true;
        }
    }
}
