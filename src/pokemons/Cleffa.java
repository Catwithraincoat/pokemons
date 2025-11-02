package pokemons;

import attacks.FlameThrower;
import attacks.Sing;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cleffa extends Pokemon {
    public Cleffa(String name, int level)
    {   super(name, level);
        setStats(80, 75, 150, 75, 150, 50);
        setType(Type.FAIRY);
        setMove(new FlameThrower(), new Sing());
    }
}
