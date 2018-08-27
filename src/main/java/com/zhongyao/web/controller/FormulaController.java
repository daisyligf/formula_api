package com.zhongyao.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhongyao.dao.FormulaMapper;
import com.zhongyao.service.FormulaService;
import com.zhongyao.web.base.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daisyli
 * @create 下午2:16
 **/
@RestController
public class FormulaController {

    @Autowired
    private FormulaService formulaService;

    /**
     * 获取方子列表
     * @return
     */
    @RequestMapping("/formula/name/list")
    public Object formulaList() {
        return ResponseResult.successed(formulaService.getAllFormulaName());

    }

    /**
     * 获取药的列表
     * @return
     */
    @RequestMapping("/formula/medicine/list")
    public Object medicineList() {
        return ResponseResult.successed(formulaService.getAllMedicineName());
    }


    /**
     * 根据方名查询出药名列表 TODO 方名_书名作为查询条件
     * @return
     */
    @RequestMapping("/formula/query/by/name")
    public Object getMedicineLisByFormulaName(@RequestParam("name") String name) {

        if (StringUtils.isEmpty(name)) {
            return ResponseResult.successed(new JSONObject());
        }
        String[] nameArr = name.split("_");
        String formulaName = nameArr[0];
        String bookName = nameArr[1];

        return ResponseResult.successed("");
    }

}
