package com.hjkj.macoo.service.impl.dao.impl.mybatis;

import com.hjkj.macoo.bean.entity.RcPermission;
import com.hjkj.macoo.bean.entity.RcPermissionExample;
import com.hjkj.macoo.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface RcPermissionMapper {
    int countByExample(RcPermissionExample example);

    int deleteByExample(RcPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RcPermission record);

    int insertSelective(RcPermission record);

    List<RcPermission> selectByExample(RcPermissionExample example);

    RcPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RcPermission record, @Param("example") RcPermissionExample example);

    int updateByExample(@Param("record") RcPermission record, @Param("example") RcPermissionExample example);

    int updateByPrimaryKeySelective(RcPermission record);

    int updateByPrimaryKey(RcPermission record);
}