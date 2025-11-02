package pokemons;

import attacks.FlameThrower;
import attacks.Sing;
import attacks.WakeUpSlap;
import ru.ifmo.se.pokemon.Type;

public class Cleffable extends Cleffa{
    public Cleffable(String name, int level) {
        super(name, level);
        setStats(90, 85, 160, 85, 160, 60);
        setMove(new FlameThrower(), new Sing(), new WakeUpSlap());
    }
}
