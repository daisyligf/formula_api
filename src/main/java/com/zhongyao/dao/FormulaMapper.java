package com.zhongyao.dao;

import com.zhongyao.domain.Formula;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@CacheConfig(cacheNames = "formula")
public interface FormulaMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Formula record);

    int insertSelective(Formula record);

    @Cacheable(key ="#p0")
    Formula selectByPrimaryKey(Integer id);

    @CachePut(key = "#p0")
    int updateByPrimaryKeySelective(Formula record);

    int updateByPrimaryKey(Formula record);

    @Cacheable(key = "all_formula_name")
    List<String> getAllFormulaNames();

    @Cacheable(key = "all_medicine_name")
    List<String> getAllMedicineNames();

    Formula selectByFormulaAndBook(String formulaName, String bookName);
}