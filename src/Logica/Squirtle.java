
package Logica;


public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }
    
    
    
    
      @Override
    protected void atacarPlacaje() {
        System.out.println("Squi Placaje");
    }

    @Override
    protected void atacarAraniazo() {
       System.out.println("Squi Araniazo");
    }

    @Override
    protected void atacarMordisco() {
       System.out.println("Squi Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
    System.out.println("Squi Hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
    System.out.println("Squi Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
    System.out.println("Squi Pistola Agua");
    }
    
    
}
