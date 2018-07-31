package com.redq.macchiato.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redq.macchiato.entity.common.Zone;
import com.redq.macchiato.service.ZoneService;

@RequestMapping("/zone")
@RestController
public class ZoneController {
	
	private static final Long CHINA_ZONE_ID = 1L;
	
	@Autowired
	private ZoneService zoneService;
	
	@GetMapping("/provinces")
	public List<Zone> provinces() {
		return zoneService.findChildren(CHINA_ZONE_ID);
	}
	
	@GetMapping("/parent")
	public Zone parent(Long id) {
		return zoneService.findParent(id);
	}
	
	@GetMapping("/parents")
	public List<Zone> parents(Long id) {
		return zoneService.findParents(id);
	}
	
	@GetMapping("/children")
	public List<Zone> children(Long id) {
		return zoneService.findChildren(id);
	}
	
	@GetMapping("/descendant")
	public List<Zone> descendant(Long id) {
		return zoneService.findDescendant(id);
	}
}
