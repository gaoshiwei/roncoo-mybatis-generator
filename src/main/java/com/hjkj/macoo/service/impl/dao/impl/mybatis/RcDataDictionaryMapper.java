package com.hjkj.macoo.service.impl.dao.impl.mybatis;

import com.hjkj.macoo.bean.entity.RcDataDictionary;
import com.hjkj.macoo.bean.entity.RcDataDictionaryExample;
import com.hjkj.macoo.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface RcDataDictionaryMapper {
    int countByExample(RcDataDictionaryExample example);

    int deleteByExample(RcDataDictionaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RcDataDictionary record);

    int insertSelective(RcDataDictionary record);

    List<RcDataDictionary> selectByExample(RcDataDictionaryExample example);

    RcDataDictionary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RcDataDictionary record, @Param("example") RcDataDictionaryExample example);

    int updateByExample(@Param("record") RcDataDictionary record, @Param("example") RcDataDictionaryExample example);

    int updateByPrimaryKeySelective(RcDataDictionary record);

    int updateByPrimaryKey(RcDataDictionary record);
}