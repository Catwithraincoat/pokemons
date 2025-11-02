package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.GROUND, 100, 100);
    }

    @Override
    public String describe() {
        return "использовал атаку Facade";
    }
}
