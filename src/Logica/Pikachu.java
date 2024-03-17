
package Logica;


public class Pikachu extends Pokemon implements IElectrico{

    int num_pika;

    public Pikachu() {
    }

    public Pikachu(int numPokedex, String nombre, double peso, String sexo, int temporada) {
        super(numPokedex, nombre, peso, sexo, temporada);
    }
    
    

    
    
    
     @Override
    protected void atacarPlacaje() {
        System.out.println("Pika Placaje");
    }

    @Override
    protected void atacarAraniazo() {
       System.out.println("Pika Araniazo");
    }

    @Override
    protected void atacarMordisco() {
       System.out.println("Pika Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pika Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pika PunioTrueno");
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
     
        
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    
    
    
    
    
}
