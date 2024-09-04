package it.mbaziekone.footballsimulator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.mbaziekone.footballsimulator.model.Player;
import it.mbaziekone.footballsimulator.service.PlayerService;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Player> getPlayer(@PathVariable Long id) {
		
		Player player = playerService.getPlayerById(id);
		if(player == null) {

			return ResponseEntity.notFound().build();		
		}
		
		return ResponseEntity.ok(player);
	}

}
