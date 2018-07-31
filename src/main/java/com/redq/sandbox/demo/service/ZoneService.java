package com.redq.sandbox.demo.service;

import java.util.List;

import com.redq.sandbox.demo.entity.common.Zone;


public interface ZoneService {
	
	Zone findParent(Long zoneId);
	
	List<Zone> findParents(Long zoneId);
	
	List<Zone> findChildren(Long zoneId);
	
	List<Zone> findDescendant(Long zoneId);
	
	List<Zone> findSiblings(Long zoneId);

	boolean contains(Long zoneId1, Long zoneId2);

}
