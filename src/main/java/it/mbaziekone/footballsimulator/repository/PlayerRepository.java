package it.mbaziekone.footballsimulator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.mbaziekone.footballsimulator.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
