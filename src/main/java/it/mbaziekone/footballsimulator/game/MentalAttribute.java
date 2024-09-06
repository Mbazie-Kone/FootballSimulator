package it.mbaziekone.footballsimulator.game;

public enum MentalAttribute {
	
	AGGRESSIVENESS("Aggressiveness"),
    VISION("Vision"),
    CREATIVITY("Creativity"),
    DETERMINATION("Determination"),
    WORK_RATE("Work Rate"),
    COURAGE("Courage"),
    OFF_THE_BALL("Off The Ball"),
    POSITIONING("Positioning"),
    DECISION_MAKING("Decision Making"),
    COMPOSURE("Composure");

    private final String attributeName;

    MentalAttribute(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeName() {
        return attributeName;
    }
}
