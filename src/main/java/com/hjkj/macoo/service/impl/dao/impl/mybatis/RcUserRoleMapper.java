package com.hjkj.macoo.service.impl.dao.impl.mybatis;

import com.hjkj.macoo.bean.entity.RcUserRole;
import com.hjkj.macoo.bean.entity.RcUserRoleExample;
import com.hjkj.macoo.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface RcUserRoleMapper {
    int countByExample(RcUserRoleExample example);

    int deleteByExample(RcUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RcUserRole record);

    int insertSelective(RcUserRole record);

    List<RcUserRole> selectByExample(RcUserRoleExample example);

    RcUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RcUserRole record, @Param("example") RcUserRoleExample example);

    int updateByExample(@Param("record") RcUserRole record, @Param("example") RcUserRoleExample example);

    int updateByPrimaryKeySelective(RcUserRole record);

    int updateByPrimaryKey(RcUserRole record);
}