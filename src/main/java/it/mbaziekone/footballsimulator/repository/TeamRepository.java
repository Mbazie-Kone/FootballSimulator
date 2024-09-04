package it.mbaziekone.footballsimulator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.mbaziekone.footballsimulator.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
