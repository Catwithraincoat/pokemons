package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DarkPulse extends SpecialMove {
    public  DarkPulse() {
        super(Type.DARK, 95, 95);
    }

    @Override
    protected double calcTypeEffect(Pokemon pokemon, Pokemon pokemon1) {
        double base = super.calcTypeEffect(pokemon, pokemon1);
        return 4 * base;
    }

    @Override
    public String describe() {
        return "использовал атаку DarkPulse";
    }
}
