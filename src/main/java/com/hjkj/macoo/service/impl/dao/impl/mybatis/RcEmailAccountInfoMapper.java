package com.hjkj.macoo.service.impl.dao.impl.mybatis;

import com.hjkj.macoo.bean.entity.RcEmailAccountInfo;
import com.hjkj.macoo.bean.entity.RcEmailAccountInfoExample;
import com.hjkj.macoo.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface RcEmailAccountInfoMapper {
    int countByExample(RcEmailAccountInfoExample example);

    int deleteByExample(RcEmailAccountInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RcEmailAccountInfo record);

    int insertSelective(RcEmailAccountInfo record);

    List<RcEmailAccountInfo> selectByExample(RcEmailAccountInfoExample example);

    RcEmailAccountInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RcEmailAccountInfo record, @Param("example") RcEmailAccountInfoExample example);

    int updateByExample(@Param("record") RcEmailAccountInfo record, @Param("example") RcEmailAccountInfoExample example);

    int updateByPrimaryKeySelective(RcEmailAccountInfo record);

    int updateByPrimaryKey(RcEmailAccountInfo record);
}