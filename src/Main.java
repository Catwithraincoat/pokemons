import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Cleffa cleffa = new Cleffa("Чужой", 1);
        Cleffairy cleffairy = new Cleffairy("Динь-динь", 1);
        Cleffable cleffable = new Cleffable("Хищник", 1);
        Seviper seviper = new Seviper("Ядовитка", 2);
        Wimpod wimpod = new Wimpod("ЖУЖУЖУ", 1);
        Galisopod galisopod = new Galisopod("Бдыщ",2);

        b.addAlly(cleffa);
        b.addAlly(seviper);
        b.addAlly(wimpod);
        b.addFoe(galisopod);
        b.addFoe(cleffable);
        b.addFoe(cleffairy);

        b.go();
    }
}