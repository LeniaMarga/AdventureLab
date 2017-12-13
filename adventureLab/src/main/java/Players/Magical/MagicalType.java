package Players.Magical;

public enum MagicalType {
    WARLOCK("Warlock"),
    WITCH("Witch");

   private String type;

    MagicalType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
