package com.redq.macchiato.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.stereotype.Service;

import com.redq.macchiato.entity.common.Zone;
import com.redq.macchiato.repository.ZoneRepository;
import com.redq.macchiato.service.ZoneService;

@Service
public class ZoneServiceImpl implements ZoneService {
	
	@Autowired
	private ZoneRepository zoneRepository;

	@Override
	public Zone findParent(Long zoneId) {
		Zone zone = zoneRepository.findById(zoneId).get();
		Zone parent = zoneRepository.findById(zone.getParentId()).get();
		return parent;
	}

	@Override
	public List<Zone> findParents(Long zoneId) {
//		Zone zone = zoneRepository.findById(zoneId).get();
//		String[] ids = zone.getPath().split(">");
//		for (String id : ids) {
//			
//		}

		// return zoneRepository.findAll(ex);
		return null;
	}

	@Override
	public List<Zone> findChildren(Long zoneId) {
		Zone condition = new Zone();
		condition.setParentId(zoneId);

		ExampleMatcher matcher = ExampleMatcher.matching()
				.withMatcher("parentId", GenericPropertyMatchers.caseSensitive());

		Example<Zone> ex = Example.of(condition, matcher);

		return zoneRepository.findAll(ex);
	}

	@Override
	public List<Zone> findDescendant(Long zoneId) {
		Zone zone = zoneRepository.findById(zoneId).get();
		
		Zone condition = new Zone();
		condition.setPath(zone.getPath());

		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withMatcher("path", GenericPropertyMatchers.startsWith()); // 姓名采用“开始匹配”的方式查询

		Example<Zone> ex = Example.of(condition, matcher);

		return zoneRepository.findAll(ex);
	}

	@Override
	public List<Zone> findSiblings(Long zoneId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(Long zoneId1, Long zoneId2) {
		// TODO Auto-generated method stub
		return false;
	}

}
