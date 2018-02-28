package com.uhope.uip.jpa.web;

import com.uhope.uip.jpa.platform.ModuleRegister;
import com.uhope.uip.base.dto.ModuleConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;


/**
 * @ClassName: PlatformRegistrer
 * @Description: 提供平台回调的控制类
 * @author: yangjian
 * @date:2017年10月19日 下午1:50:16
 * @Copyright: 2017 www.uhope.com Inc. All rights reserved.
 */
@RestController
public class ModuleServiceCallbackController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ModuleServiceCallbackController.class);

    @Autowired
    private ModuleRegister moduleRegister;

    /**
     * @throws
     * @Title: moduleregister
     * @Description: 提供给OMS 平台将moduleId 回写到业务，同时 返回 业务模块支持的功能和菜单列表
     * 每个业务模块应用，都必须提供该接口，
     * 该接口主要提供给OMS 模块接入时使用
     * <p>
     * ！！！   如果作为业务平台，可以忽略该接口实现。！！！
     * @param: @param appId
     * @return: void
     */
    @PostMapping("/moduleregister")
    public ModuleConfig moduleregister(@PathParam(value = "moduleId") String moduleId) {

        if (StringUtils.isEmpty(moduleId)) {
            LOGGER.error("moduleregister failure!!!, the moduleId is null!");
            return null;
        }

        ModuleConfig config = moduleRegister.register(moduleId);
        if (config != null) {
            //TODO 这里说明是成功的, 更新模块ID到配置文件
            //return ResponseMsgUtil.success(config);
            LOGGER.info("get module info Success.");
        } else {
            //return ResponseMsgUtil.failure();
            LOGGER.error("get module info Failure.");
        }
        return config;

    }


}
