package Players.Magical;

public class Warlock extends Magical implements ICast{

    protected CreatureType creatureType;

    public Warlock(String name, int healthValue, MagicalType magicalType, CreatureType creatureType) {
        super (name, healthValue, magicalType);
        this.creatureType = creatureType;
    }


    public String cast(String data) {
        return null;
    }

    public CreatureType getCreatureType() {
        return creatureType;
    }

    public void setCreatureType(CreatureType creatureType) {
        this.creatureType = creatureType;
    }
}
