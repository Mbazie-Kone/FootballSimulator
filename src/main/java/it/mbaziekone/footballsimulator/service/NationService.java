package it.mbaziekone.footballsimulator.service;

import java.util.List;

import it.mbaziekone.footballsimulator.model.Nation;

public interface NationService {

	Nation getNationById(Long nationId);
	
	List<Nation> getAllNations();

}
