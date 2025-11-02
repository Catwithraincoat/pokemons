package pokemons;

import attacks.DoubleTeam;
import attacks.Facade;
import attacks.Waterfall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wimpod extends Pokemon {
    public Wimpod(String name, int level) {
        super(name, level);
        setType(Type.BUG);
        setStats(80, 75, 150, 75, 150, 50);
        setMove(new Facade(), new Waterfall(), new DoubleTeam());
    }
}
