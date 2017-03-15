package com.hjkj.macoo.service.impl.dao.impl.mybatis;

import com.hjkj.macoo.bean.entity.RcDataDictionaryList;
import com.hjkj.macoo.bean.entity.RcDataDictionaryListExample;
import com.hjkj.macoo.util.base.MyBatis;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MyBatis
public interface RcDataDictionaryListMapper {
    int countByExample(RcDataDictionaryListExample example);

    int deleteByExample(RcDataDictionaryListExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RcDataDictionaryList record);

    int insertSelective(RcDataDictionaryList record);

    List<RcDataDictionaryList> selectByExample(RcDataDictionaryListExample example);

    RcDataDictionaryList selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RcDataDictionaryList record, @Param("example") RcDataDictionaryListExample example);

    int updateByExample(@Param("record") RcDataDictionaryList record, @Param("example") RcDataDictionaryListExample example);

    int updateByPrimaryKeySelective(RcDataDictionaryList record);

    int updateByPrimaryKey(RcDataDictionaryList record);
}