public class Mota {
    public String marca;
    private String modelo;
    private String cor;
    private float cilindrada;
    private boolean ligada;
    
    public Mota(){
        this.marca = "Dafra";
        this.modelo = "Apache";
        this.desligar();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }
    public void ligar(){
        this.ligada = true;
    }
    public void desligar(){
        this.ligada = false;
    }
    public void status(){
        System.out.println("Marca:"+this.getMarca());
        System.out.println("Modelo"+this.getModelo());
        System.out.println("Cor:"+this.getCor());
        System.out.println("Cilindrada"+this.getCilindrada());
    }
}
