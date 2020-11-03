package com.shop.service.impl;

import com.shop.entity.GoodsSpecification;
import com.shop.mapper.GoodsSpecificationMapper;
import com.shop.service.GoodsSpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsSpecificationServiceImpl implements GoodsSpecificationService {

    @Autowired
    private GoodsSpecificationMapper goodsSpecificationMapper;

    @Override
    public List<GoodsSpecification> getGoodsSpecificationByGid(Integer goodsSpecificationId) {
        return goodsSpecificationMapper.getGoodsSpecificationByGid(goodsSpecificationId);
    }

}