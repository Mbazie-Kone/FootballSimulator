package it.mbaziekone.footballsimulator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.mbaziekone.footballsimulator.model.Nation;
import it.mbaziekone.footballsimulator.model.Player;
import it.mbaziekone.footballsimulator.model.Team;
import it.mbaziekone.footballsimulator.service.NationService;
import it.mbaziekone.footballsimulator.service.PlayerService;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
	
	@Autowired
	private NationService nationService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Player> getPlayer(@PathVariable Long id) {
		
		Player player = playerService.getPlayerById(id);
		if(player == null) {

			return ResponseEntity.notFound().build();		
		}
		
		return ResponseEntity.ok(player);
	}
	
	@GetMapping("/team/{teamId}")
	public List<Player> getPlayersByteam(@PathVariable Long teamId) {
		
		Team team = new Team();
		team.setId(teamId);
		
		return playerService.getPlayersByTeam(team);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Player> savePlayer(@PathVariable Player player) {
		
		playerService.savePlayer(player);
		
		return ResponseEntity.ok(player);
	}
	
	@GetMapping("/nation/{nationId}")
    public List<Player> getPlayersByNation(@PathVariable Long nationId) {
		
        Nation nation = nationService.getNationById(nationId);
        
        return playerService.getPlayersByNationality(nation);
    }

}
