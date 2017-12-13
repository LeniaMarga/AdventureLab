package Players.Magical;

public enum CreatureType {
    OGRE(1000),
    DRAGON(2000);

    private final int power;

    CreatureType(int power) {

        this.power = power;
    }

    public int getPower() {
        return power;
    }

}
