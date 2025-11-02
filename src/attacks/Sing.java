package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sing extends PhysicalMove {
    public Sing() {
        super(Type.PSYCHIC, 80, 100);
    }

    @Override
    public String describe() {
        return "применил аттаку Sing";
    }
}
