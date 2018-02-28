package com.uhope.uip.jpa.platform.impl;

import com.uhope.uip.jpa.domain.SmApplication;
import com.uhope.uip.jpa.domain.SynchronousData;
import com.uhope.uip.jpa.platform.SynchronousAppData;
import org.springframework.stereotype.Service;

@Service
public class DefaultSynchronousAppDataImpl implements SynchronousAppData {

	@Override
	public boolean synchronous(SynchronousData syncData) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean synchronousApplication(SmApplication app) {
		// TODO Auto-generated method stub
		return false;
	}

}
