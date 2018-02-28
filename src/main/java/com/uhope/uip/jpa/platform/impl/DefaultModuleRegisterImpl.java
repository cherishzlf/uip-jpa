package com.uhope.uip.jpa.platform.impl;

import java.net.URL;

import com.uhope.uip.jpa.Application;
import com.uhope.uip.jpa.platform.ModuleRegister;
import com.uhope.uip.jpa.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.uhope.uip.base.dto.ModuleConfig;

@Service
public class DefaultModuleRegisterImpl implements ModuleRegister {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultModuleRegisterImpl.class);

    @Override
    public ModuleConfig register(String moduleId) {

        //TODO 保存moduleId 到配置文件, 这里是平台分配的moduleId
        LOGGER.info("the moduleId is {}.", moduleId);
        //返回业务模块 提供的菜单、组件、Page等信息给 平台
        URL url = Application.class.getResource("/");

        ModuleConfig config = JsonUtil.parseJsonConfig(url.getPath() + "static/config/config.json");

        return config;
    }

}
