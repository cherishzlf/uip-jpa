package com.uhope.uip.jpa.repository;

import com.uhope.uip.jpa.domain.SmApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SmApplicationRepository extends PagingAndSortingRepository<SmApplication, String>, JpaRepository<SmApplication, String> {

    //public List<SmModuleFunction> findByReceiverInOrderByCreateTimeDesc(List<String> list);

    //public List<SmModuleFunction> findByReceiverInOrderByCreateTimeDesc(List<String> list, Pageable pageable);

    public SmApplication findById(String id);
}
