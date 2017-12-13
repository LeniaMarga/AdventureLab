package Players.NonMagical;

public enum NonMagicalType {
    KNIGHT("Knight"),
    DWARF("Dwarf"),
    BARBARIAN("Barbarian");

    private String type;


    NonMagicalType(String type) {
        this.type =type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
