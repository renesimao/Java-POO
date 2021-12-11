package projetopessoapoo;


public class Tecnico extends Aluno {
    private int registro;
    
    public void praticar(){
        System.out.println("Aluno"+this.nome+"Está praticando");
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
    
}
