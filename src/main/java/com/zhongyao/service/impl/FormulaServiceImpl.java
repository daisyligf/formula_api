package com.zhongyao.service.impl;

import com.zhongyao.dao.FormulaMapper;
import com.zhongyao.domain.Formula;
import com.zhongyao.service.FormulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author daisyli
 * @create 下午3:05
 **/
@Service
public class FormulaServiceImpl implements FormulaService {

    @Autowired
    private FormulaMapper formulaMapper;

    /**
     * 获取所有的方名
     * @return
     */
    public List<String> getAllFormulaName() {

        return formulaMapper.getAllFormulaNames();
    }

    /**
     * 获取所有的药名
     * @return
     */
    public List<String> getAllMedicineName() {

        return formulaMapper.getAllMedicineNames();
    }

    public Formula findFormula(String formulaName, String bookName) {
        return formulaMapper.selectByFormulaAndBook(formulaName, bookName);
    }
}
