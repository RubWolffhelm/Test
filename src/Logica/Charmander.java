
package Logica;


public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }
    
     @Override
    protected void atacarPlacaje() {
        System.out.println("Char Placaje");
    }

    @Override
    protected void atacarAraniazo() {
       System.out.println("Char Araniazo");
    }

    @Override
    protected void atacarMordisco() {
       System.out.println("Char Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Char Fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Char Lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Char Ascuas");
    }
}
