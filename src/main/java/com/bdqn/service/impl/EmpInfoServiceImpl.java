package com.bdqn.service.impl;

import com.bdqn.dao.EmpInfoMapper;
import com.bdqn.pojo.EmpInfo;
import com.bdqn.service.EmpInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("empInfoService")
public class EmpInfoServiceImpl implements EmpInfoService {

    @Resource
    private EmpInfoMapper empInfoMapper;

    public List<EmpInfo> getList() {
        return empInfoMapper.getList();
    }
}
