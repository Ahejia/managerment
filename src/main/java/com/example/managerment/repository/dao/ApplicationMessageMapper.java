package com.example.managerment.repository.dao;

import com.example.managerment.base.IBaseDao;
import com.example.managerment.pojo.ApplicationMessage;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: hj
 * @Description: 应用信息
 * @Date:Create：in 2019/10/22 16:52
 */
@Mapper
public interface ApplicationMessageMapper extends IBaseDao<ApplicationMessage> {
}
