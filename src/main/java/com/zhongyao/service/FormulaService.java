package com.zhongyao.service;

import com.zhongyao.domain.Formula;

import java.util.List;

/**
 * @author daisyli
 * @create 下午3:04
 **/
public interface FormulaService {

    List<String> getAllFormulaName();

    List<String> getAllMedicineName();

    Formula findFormula(String formulaName, String bookName);
}
