import pokemons.Cleffa;
import pokemons.Cleffable;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Cleffa p1 = new Cleffa("Чужой", 1);
        Cleffable p2 = new Cleffable("Хищник", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}