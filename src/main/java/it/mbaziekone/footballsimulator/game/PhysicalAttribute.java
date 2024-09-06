package it.mbaziekone.footballsimulator.game;

public enum PhysicalAttribute {
	
	SPEED("Speed"),
    ACCELERATION("Acceleration"),
    AGILITY("Agility"),
    BALANCE("Balance"),
    STRENGTH("Strength"),
    STAMINA("Stamina"),
    FITNESS("Fitness");

    private final String attributeName;

    PhysicalAttribute(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeName() {
        return attributeName;
    }
}
