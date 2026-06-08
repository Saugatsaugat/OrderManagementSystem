package com.saugat.oms.mapper;

import com.saugat.oms.dto.ProductDto;
import com.saugat.oms.entity.Product;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {ProductMapper.class})
public abstract class ProductDetailMapper implements IBaseMapper<Product, ProductDto> {
}
