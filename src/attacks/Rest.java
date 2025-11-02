package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 25);
    }

    Effect e = new Effect().turns(2);

    @Override
    public void applySelfEffects(Pokemon p) {
        e.sleep(p);
        p.restore();
    }

    @Override
    public String describe() {
        return "хочет спать!";
    }
}
