package com.aspire.OnlineMeal.mapper;

import com.aspire.OnlineMeal.model.UserInfo;
import java.math.BigDecimal;

public interface UserInfoMapper{
    int deleteByPrimaryKey(BigDecimal id)  throws Exception ; 

    int insert(UserInfo record) throws Exception ;

    int insertSelective(UserInfo record) throws Exception ;

    UserInfo selectByPrimaryKey(BigDecimal id) throws Exception ;

    int updateByPrimaryKeySelective(UserInfo record) throws Exception ;

    int updateByPrimaryKeyWithBLOBs(UserInfo record) throws Exception ;

    int updateByPrimaryKey(UserInfo record) throws Exception ;
}