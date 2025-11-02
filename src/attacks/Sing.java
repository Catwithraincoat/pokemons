package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sing extends PhysicalMove {
    public Sing() {
        super(Type.STEEL, 80, 100);
    }

    @Override
    public String describe() {
        return "применил аттаку Sing";
    }
}
