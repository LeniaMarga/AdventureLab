package Players.Magical;

public class Witch extends Magical implements ICast {



    public Witch(String name, int healthValue, MagicalType magicalType, CreatureType creatureType) {
        super (name, healthValue, magicalType, creatureType);

    }


    public int cast(String creatureName) {

        int cast = creatureType.getPower ()* 3;

        return setAttackPower(creatureType) + cast;
    }

    public CreatureType getCreatureType() {
        return creatureType;
    }

    public void setCreatureType(CreatureType creatureType) {
        this.creatureType = creatureType;
    }
}
