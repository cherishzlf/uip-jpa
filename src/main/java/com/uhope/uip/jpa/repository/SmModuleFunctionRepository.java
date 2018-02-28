package com.uhope.uip.jpa.repository;

import com.uhope.uip.jpa.domain.SmModuleFunction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SmModuleFunctionRepository extends PagingAndSortingRepository<SmModuleFunction, String>, JpaRepository<SmModuleFunction, String> {

    //public List<SmModuleFunction> findByReceiverInOrderByCreateTimeDesc(List<String> list);

    //public List<SmModuleFunction> findByReceiverInOrderByCreateTimeDesc(List<String> list, Pageable pageable);

    public SmModuleFunction findById(String id);

    public List<SmModuleFunction> findByModuleIdIn(List<String> moduleIdList);

    public void deleteByModuleIdIn(List<String> moduleIdList);
}
