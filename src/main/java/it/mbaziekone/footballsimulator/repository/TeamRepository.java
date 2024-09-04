package it.mbaziekone.footballsimulator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.mbaziekone.footballsimulator.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
