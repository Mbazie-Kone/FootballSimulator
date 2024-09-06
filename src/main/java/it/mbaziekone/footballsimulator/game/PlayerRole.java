package it.mbaziekone.footballsimulator.game;

public enum PlayerRole {
	
	GOALKEEPER("Goalkeeper"),
    FULL_BACK("Full Back"),
    CENTER_BACK("Center Back"),
    DEFENSIVE_MIDFIELDER("Defensive Midfielder"),
    CENTRAL_MIDFIELDER("Central Midfielder"),
    WINGER("Winger"),
    ATTACKING_MIDFIELDER("Attacking Midfielder"),
    SECOND_STRIKER("Second Striker"),
    CENTER_FORWARD("Center Forward");

    private final String roleName;

    PlayerRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
