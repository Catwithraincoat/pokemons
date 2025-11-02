package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class WakeUpSlap extends StatusMove {
    public WakeUpSlap()
    {
        super(Type.PSYCHIC, 0, 100 );
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ACCURACY, -1);
    }

    public String describe()
    {
        return "ДОБРОЕ УТРО СОЛНЫШКО! *slaaaaap*";
    }
}
