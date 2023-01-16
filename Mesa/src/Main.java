public class Main {
    public static void main(String[] args) {
        Mesa mesa; //creando una variable/objeto
        mesa = new Mesa(new Color("verde"), 10); //espacio de memoria/instancia
        Mesa otraMesa = new Mesa(new Color("Azul"), 5);

        //manipulando el objeto
        mesa.quitar(); //No hay nada que quitar
        mesa.poner(new Item("Cuaderno", 20)); //No tiene capacidad
        //System.out.println(mesa.quitar());
        otraMesa.poner(mesa.quitar());
        mesa.poner(new Item("Esfero", 2)); //Si dejar
        mesa.poner(new Item("Regla",17)); //No tiene capacidad
        mesa.poner(new Item("Regla",7)); //Si deja
        System.out.println(mesa.quitar());

    }
} //destruir el objeto