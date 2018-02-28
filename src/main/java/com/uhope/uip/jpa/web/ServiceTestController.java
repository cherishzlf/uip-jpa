package com.uhope.uip.jpa.web;

import com.uhope.uip.base.dto.Result;
import com.uhope.uip.base.util.ResponseMsgUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @ClassName: ServiceTestController
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: yangjian
 * @date:2017年11月6日 下午7:46:07
 * @Copyright: 2017 www.uhope.com Inc. All rights reserved.
 */
@RestController
public class ServiceTestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceTestController.class);

    //reqServiceTest
    @PostMapping("/reqServiceTest")
    public Result<Object> reqServiceTest(@PathParam(value = "name") String name) {

        if (StringUtils.isEmpty(name)) {
            LOGGER.error("reqServiceTest failure!!!, the name is null!");
            return null;
        }

        LOGGER.info("the input parameter name is {}.", name);

        if ("yangjian".equals(name)) {
            return ResponseMsgUtil.success(null);

        } else {
            //return ResponseMsgUtil.failure();
            return ResponseMsgUtil.failure();
        }

    }
}
