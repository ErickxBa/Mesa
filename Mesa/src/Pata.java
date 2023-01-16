public class Pata {
    private double altura;
    private Cauchito cauchito;
    private Color color;

    public Pata() {
        this.altura = 1.0;
        this.cauchito = new Cauchito();
        this.color = new Color("Negro");
    }
}
