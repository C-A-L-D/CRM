package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.entity.OffMess;
import com.sc.mapper.OffMessMapper;
import com.sc.service.OffMessService;

@Service
public class OffMessServiceImpl implements OffMessService {
	@Autowired
       OffMessMapper offMessMapper;
	@Override
	public List<OffMess> select() {
		return this.offMessMapper.selectByExample(null);
	}

}
