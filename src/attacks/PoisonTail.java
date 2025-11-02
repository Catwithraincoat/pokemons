package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class PoisonTail extends PhysicalMove {
    public PoisonTail() {
        super(Type.POISON, 60, 80);

    }

    @Override
    public String describe(){
        return "Удар ЯДовитым хвостом!!";
    }
}
