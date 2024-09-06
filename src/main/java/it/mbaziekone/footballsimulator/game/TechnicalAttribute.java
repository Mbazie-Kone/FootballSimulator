package it.mbaziekone.footballsimulator.game;

public enum TechnicalAttribute {
	
	HEADING("Heading"),
    SHOOTING("Shooting"),
    PASSING("Passing"),
    TECHNIQUE("Technique"),
    DRIBBLING("Dribbling"),
    FINISHING("Finishing"),
    MARKING("Marking"),
    TACKLING("Tackling");

    private final String attributeName;

    TechnicalAttribute(String physical) {
        this.attributeName = physical;
    }

    public String getAttributeName() {
        return attributeName;
    }
}
