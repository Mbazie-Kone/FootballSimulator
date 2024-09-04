package it.mbaziekone.footballsimulator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.mbaziekone.footballsimulator.model.Nation;

@Repository
public interface NationRepository extends JpaRepository<Nation, Long> {

}
