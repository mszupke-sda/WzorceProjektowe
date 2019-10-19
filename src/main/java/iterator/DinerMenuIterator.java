package iterator;

public class DinerMenuIterator implements Iterator {

    PozycjaMenu[] lista;
    int pozycja = 0;

    public DinerMenuIterator(PozycjaMenu[] lista) {
        this.lista = lista;
    }

    public boolean hasNext() {
        if (pozycja >= lista.length || lista[pozycja] == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        PozycjaMenu menuItem = lista[pozycja];
        pozycja = pozycja + 1;
        return menuItem;
    }
}
