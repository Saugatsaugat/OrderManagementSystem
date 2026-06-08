package com.saugat.oms.mapper;

import com.saugat.oms.dto.ProductDto;
import com.saugat.oms.entity.Product;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {CategoryMapper.class, SellerMapper.class})
public abstract class ProductMapper implements IBaseMapper<Product, ProductDto> {
}
