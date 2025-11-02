package pokemons;

import attacks.DoubleTeam;
import attacks.Facade;
import attacks.Liquidation;
import attacks.Waterfall;
import ru.ifmo.se.pokemon.Type;

public final class Galisopod extends Wimpod {
    public Galisopod(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.WATER);
        setStats(90, 85, 160, 85, 160, 60);
        setMove(new Facade(), new Waterfall(), new DoubleTeam(),new Liquidation());
    }
}
