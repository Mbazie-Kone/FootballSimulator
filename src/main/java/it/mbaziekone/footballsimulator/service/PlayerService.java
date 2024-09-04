package it.mbaziekone.footballsimulator.service;

import java.util.List;

import it.mbaziekone.footballsimulator.model.Nation;
import it.mbaziekone.footballsimulator.model.Player;
import it.mbaziekone.footballsimulator.model.Team;

public interface PlayerService {
	
	public Player getPlayerById(Long id);
	
	public List<Player> getPlayersByTeam(Team team);
	
	public void savePlayer(Player player);

	public List<Player> getPlayersByNationality(Nation nation);
}
