package Logica;


public class Integr {

 
    public static void main(String[] args) {
       
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulba = new Bulbasaur();
        Pikachu pika = new Pikachu(4, "pikachu", 23, "mujer", 2);
        
        
        
        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();
        bulba.atacarAraniazo();
        bulba.atacarDrenaje();
        pika.atacarAraniazo();
        pika.atacarImpactrueno();
        
        System.out.println("Soy Pikachu, y mi peso es: " + pika.getPeso() + "kg");
        System.out.println("Soy Pikachu, y mi numero en la pokedex es: " + pika.getNumPokedex());
        System.out.println("Soy Pikachu, y mi sexo es: " + pika.getSexo());
        System.out.println("Soy Pikachu, y mi temporada es: " + pika.getTemporada());       
        
        
        
        
    }
    
}
