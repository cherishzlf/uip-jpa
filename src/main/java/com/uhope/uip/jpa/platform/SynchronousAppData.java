package com.uhope.uip.jpa.platform;

import com.uhope.uip.jpa.domain.SmApplication;
import com.uhope.uip.jpa.domain.SynchronousData;

/**
 * @ClassName: SynchronousAppData
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: yangjian
 * @date:2017年10月26日 上午10:10:20
 * @Copyright: 2017 www.uhope.com Inc. All rights reserved.
 */
public interface SynchronousAppData {

    /**
     * @throws
     * @Title: synchronous
     * @Description: 提供给平台调用的数据同步接口
     * @param: @param syncData
     * @param: @return
     * @return: boolean
     */
    public boolean synchronous(SynchronousData syncData);

    /**
     * @throws
     * @Title: synchronousApplication
     * @Description: 同步Application基础数据
     * @param: @param app
     * @param: @return
     * @return: boolean
     */
    public boolean synchronousApplication(SmApplication app);
}
