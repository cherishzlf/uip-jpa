package com.uhope.uip.jpa.web;

import com.uhope.uip.jpa.domain.SmApplication;
import com.uhope.uip.jpa.domain.SynchronousData;
import com.uhope.uip.jpa.platform.SynchronousAppData;
import com.uhope.uip.base.dto.Result;
import com.uhope.uip.base.util.ResponseMsgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ServicePlatformCallbackController {

	@Autowired
	private SynchronousAppData synchronousAppData;
	/**
	 * @Title: synchronous
	 * @Description: 提供给平台回调的同步接口，这个主要是作为业务平台的时候，需要提供该接口
	 *               ！！！   如果作为公共业务模块，可以忽略该接口实现。！！！
	 * @param: @param appId
	 * @param: @return
	 * @return: ModuleConfig
	 * @throws
	 */
	@PostMapping("/synchronous")
	public Result<Object> synchronous(@RequestBody SynchronousData syncData) {

		//SmApplication app = JsonUtil.parseApplication(body);
		//注意：同步时，需要注意检查是否有该数据，如果有就是更新操作，或者是 OMS 与 业务平台数据库合设的情况。
		if(synchronousAppData.synchronous(syncData)){
			return ResponseMsgUtil.success(null);
		}
		else{
			return ResponseMsgUtil.failure();
		}

		//return null;

	}

	/**
	 * @Title: appregister
	 * @Description: 同步业务App基础信息的接口
	 *          ！！！   如果作为公共业务模块，可以忽略该接口实现。！！！
	 * @param: @param app
	 * @param: @return
	 * @return: Result
	 * @throws
	 */
	@PostMapping("/synchronousApp")
	public Result<Object> synchronousApp(@RequestBody SmApplication app ) {

		//保存App信息，如果 SmApplication 信息已存在则更新，这里主要考虑 平台和 业务 数据库分库 或 数据库合设的情况

		//XXX 该接口后面考虑是否需要提供

		if(synchronousAppData.synchronousApplication(app)){
			return ResponseMsgUtil.success(null);
		}
		else{
			return ResponseMsgUtil.failure();
		}

	}
}
