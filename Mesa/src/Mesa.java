
public class Mesa {
    public static final int NUMERO_PATAS = 4;
    private Item[] items;
    private Pata[] patas;
    private Color color;
    private int capacidadMáxima;
    private int cantidadItems;
    private int espacioOcupado;

    public Mesa(Color color, int capacidadMáxima) {
        this.color = color;
        this.capacidadMáxima = capacidadMáxima;
        this.patas = new Pata[NUMERO_PATAS];
        this.items = new Item[10]; //todo: mejorar en el segundo bimestre
        for (Pata pata : this.patas) {
            pata = new Pata();
        }
    }

    public void poner(Item item) {
        if(item == null){
            System.out.println("El item es inválido");
            return;
        }
        if (!laMesaTieneEspacioSuficiente(item)) {
            System.out.println("No se puede colocar item: " + item);
            return;
        }
        this.items[this.cantidadItems] = item;
        System.out.println("La mesa tiene un objeto: " + this.items[this.cantidadItems++]);
    }

    private boolean laMesaTieneEspacioSuficiente(Item item) {
        return this.capacidadMáxima - this.espacioOcupado - item.getCapacidad() >= 0;
    }

    public Item quitar() {
        if (!laMesaTieneItem()) {
            System.out.println("No hay nada que quitar");
            return null;
        }
        Item objeto = this.items[--this.cantidadItems];
        this.items[this.cantidadItems] = null;
        System.out.println("Se ha quitado el objeto: " + objeto);
        return objeto;
    }

    private boolean laMesaTieneItem() {
        return cantidadItems != 0;
    }
}
