package Players.Magical;

public enum CreatureType {
    OGRE(1000),
    DRAGON(2000);

    private final int health;

    CreatureType(int health) {
        this.health = health;
    }
}
