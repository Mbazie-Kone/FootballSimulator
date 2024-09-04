package it.mbaziekone.footballsimulator.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.mbaziekone.footballsimulator.model.Nation;
import it.mbaziekone.footballsimulator.repository.NationRepository;
import it.mbaziekone.footballsimulator.service.NationService;

@Service
public class NationServiceImpl implements NationService {
	
	@Autowired
	private NationRepository nationRepository;

	@Override
	public Nation getNationById(Long nationId) {
		
		return nationRepository.findById(nationId).orElse(null);
	}

	@Override
	public List<Nation> getAllNations() {
		
		return nationRepository.findAll();
	}

}
