package com.hjkj.macoo.service.impl.dao.impl.mybatis;

import com.hjkj.macoo.bean.entity.RcRole;
import com.hjkj.macoo.bean.entity.RcRoleExample;
import com.hjkj.macoo.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface RcRoleMapper {
    int countByExample(RcRoleExample example);

    int deleteByExample(RcRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RcRole record);

    int insertSelective(RcRole record);

    List<RcRole> selectByExample(RcRoleExample example);

    RcRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RcRole record, @Param("example") RcRoleExample example);

    int updateByExample(@Param("record") RcRole record, @Param("example") RcRoleExample example);

    int updateByPrimaryKeySelective(RcRole record);

    int updateByPrimaryKey(RcRole record);
}