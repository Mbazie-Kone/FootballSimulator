package it.mbaziekone.footballsimulator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.mbaziekone.footballsimulator.model.Nation;

public interface NationRepository extends JpaRepository<Nation, Long> {

}
