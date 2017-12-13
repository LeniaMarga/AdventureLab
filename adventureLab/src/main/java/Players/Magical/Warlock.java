package Players.Magical;

public class Warlock extends Magical implements ICast{



    public Warlock(String name, int healthValue, MagicalType magicalType, CreatureType creatureType) {
        super (name, healthValue, magicalType, creatureType);

    }


    public int cast(String creatureName) {
        int cast = creatureType.getPower ()* 5;

        return setAttackPower(creatureType) + cast;
    }

    public CreatureType getCreatureType() {
        return creatureType;
    }

    public void setCreatureType(CreatureType creatureType) {
        this.creatureType = creatureType;
    }

    public int setAttackPower(CreatureType creatureType){

        return creatureType.getPower ()+ healthValue;
    }
}
