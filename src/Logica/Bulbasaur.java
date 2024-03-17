
package Logica;

public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulb Placaje");
    }

    @Override
    protected void atacarAraniazo() {
       System.out.println("Bulb Araniazo");
    }

    @Override
    protected void atacarMordisco() {
       System.out.println("Bulb Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulb Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulb Paralizar");
    }
    
    
    
}
