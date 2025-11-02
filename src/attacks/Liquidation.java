package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Liquidation extends PhysicalMove {
    public Liquidation() {
        super(Type.WATER, 90, 100);
    }

    @Override
    public String describe() {
        return "использовал атаку Liquidation";
    }
}
