package com.uhope.uip.jpa.repository;

import com.uhope.uip.jpa.domain.SmApplicationModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SmApplicationModuleRepository extends PagingAndSortingRepository<SmApplicationModule, String>, JpaRepository<SmApplicationModule, String> {

    //public List<SmModuleFunction> findByReceiverInOrderByCreateTimeDesc(List<String> list);

    //public List<SmModuleFunction> findByReceiverInOrderByCreateTimeDesc(List<String> list, Pageable pageable);

    public SmApplicationModule findById(String id);

    List<SmApplicationModule> findByAppId(String appId);

    /**
     * 根据模块类型获取模块信息列表,当前主要针对系统管理类型
     * 返回值参考 List<SmApplicationModule> {@link SmApplicationModule}
     *
     * @param type
     * @return List<SmApplicationModule> {@link SmApplicationModule}
     * @Title: findByType
     * @Description: 根据模块类型获取模块信息列表, 当前主要针对系统管理类型
     * @throw
     */
    List<SmApplicationModule> findByType(Integer type);

    public void deleteByAppId(String appId);
}
