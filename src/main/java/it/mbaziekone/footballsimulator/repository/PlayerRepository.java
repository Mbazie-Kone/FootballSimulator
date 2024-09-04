package it.mbaziekone.footballsimulator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.mbaziekone.footballsimulator.model.Player;
import it.mbaziekone.footballsimulator.model.Team;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
	
	List<Player> findByTeam(Team team);
}
