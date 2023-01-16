public class Item {
    private String descripción;
    private int capacidad;

    public Item(String descripción, int capacidad) {
        this.descripción = descripción;
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return descripción;
    }
}
