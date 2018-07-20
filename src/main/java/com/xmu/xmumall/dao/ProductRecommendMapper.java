package com.xmu.xmumall.dao;

import com.xmu.xmumall.entity.ProductRecommend;
import com.xmu.xmumall.entity.ProductRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductRecommendMapper {
    long countByExample(ProductRecommendExample example);

    int deleteByExample(ProductRecommendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductRecommend record);

    int insertSelective(ProductRecommend record);

    List<ProductRecommend> selectByExample(ProductRecommendExample example);

    ProductRecommend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductRecommend record, @Param("example") ProductRecommendExample example);

    int updateByExample(@Param("record") ProductRecommend record, @Param("example") ProductRecommendExample example);

    int updateByPrimaryKeySelective(ProductRecommend record);

    int updateByPrimaryKey(ProductRecommend record);
}