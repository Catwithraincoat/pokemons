package pokemons;

import attacks.DoubleTeam;
import attacks.Facade;
import attacks.Liquidation;
import attacks.Waterfall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Seviper extends Pokemon {
    public Seviper(String name, int level) {
        super(name, level);
        setType(Type.POISON);
        setStats(90, 85, 160, 85, 160, 60);
        setMove();
    }
}
