import java.util.ArrayList;

public class Asn5 {
   public static void main(String[] args) {
      ArrayList<String> pokemon = new ArrayList<String>();
      // Creates List for Pokemon
      pokemon.add("Squirtle");
      pokemon.add("Pikachu");
      pokemon.add("Charmander");
      pokemon.add("Bulbasaur");
      System.out.println("This is a list of current pokemon in our array to chose");
      for (int i = 0; i < pokemon.size(); i++) {
         System.out.println(pokemon.get(i));
      }

      ArrayList<Integer> Mynumber = new ArrayList<Integer>();
      // Creates list for numbers
      Mynumber.add(7);
      Mynumber.add(25);
      Mynumber.add(4);
      Mynumber.add(1);
      System.out.println("This is a list of the current pokemon's pokedex number");

      for (Integer i : Mynumber) {
         System.out.println(i);
      }
   }
}
