package it.mbaziekone.footballsimulator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.mbaziekone.footballsimulator.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
