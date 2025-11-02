package pokemons;

import ru.ifmo.se.pokemon.Pokemon;

public class Wimpod extends Pokemon {
    public Wimpod(String name, int level) {
        super(name, level);
        setStats(80, 75, 150, 75, 150, 50);
    }
}
