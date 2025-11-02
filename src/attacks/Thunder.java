package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Thunder extends PhysicalMove {
    public Thunder(){
        super(Type.FLYING, 100, 100);

    }

    @Override
    public String describe(){
        return "использовал атаку Thunder";
    }
}
