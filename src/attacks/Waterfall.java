package attacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Waterfall extends SpecialMove {
    public Waterfall() {
        super(Type.WATER, 100, 100);

    }

    @Override
    public String describe(){
        return "использовал атаку Waterfall";
    }
}
