package Players.NonMagical;

public enum WeaponType {
    SWORD(1000),
    AXE(800),
    CLUB(900);

    private final int value;

    WeaponType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
