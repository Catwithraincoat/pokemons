package pokemons;

import attacks.FlameThrower;
import attacks.Sing;
import attacks.Thunder;
import attacks.WakeUpSlap;
import ru.ifmo.se.pokemon.Type;

public final class Cleffairy extends Cleffable
{
    public Cleffairy(String name, int level) {
        super(name, level);
        setStats(100, 95, 170, 95, 170, 70);
        setMove(new FlameThrower(), new Sing(), new WakeUpSlap(), new Thunder());
    }
}
