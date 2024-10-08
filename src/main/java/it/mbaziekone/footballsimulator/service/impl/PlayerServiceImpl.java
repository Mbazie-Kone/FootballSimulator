package it.mbaziekone.footballsimulator.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.mbaziekone.footballsimulator.model.Nation;
import it.mbaziekone.footballsimulator.model.Player;
import it.mbaziekone.footballsimulator.model.Team;
import it.mbaziekone.footballsimulator.repository.PlayerRepository;
import it.mbaziekone.footballsimulator.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public Player getPlayerById(Long id) {
	
		return playerRepository.findById(id).orElse(null);
	}

	@Override
	public List<Player> getPlayersByTeam(Team team) {
		
		return playerRepository.findByTeam(team);
	}

	@Override
	public void savePlayer(Player player) {
		playerRepository.save(player);
	}

	@Override
	public List<Player> getPlayersByNationality(Nation nation) {
		
		 return playerRepository.findByNationality(nation);
	}
}
