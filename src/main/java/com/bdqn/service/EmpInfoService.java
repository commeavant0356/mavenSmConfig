package com.bdqn.service;

import com.bdqn.pojo.EmpInfo;

import java.util.List;

public interface EmpInfoService {
    /**
     * 获取所有员工的信息
     * @return
     */
    List<EmpInfo> getList();
}
