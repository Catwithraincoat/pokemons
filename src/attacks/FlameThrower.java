package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FlameThrower extends SpecialMove {
    public FlameThrower() {
        super(Type.FIRE, 90, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override
    protected double calcTypeEffect(Pokemon pokemon, Pokemon pokemon1) {
        double base = super.calcTypeEffect(pokemon, pokemon1);
        return 4 * base;
    }

    @Override
    public String describe() {
        return "применил атаку специальную FlameThrower";
    }
}
