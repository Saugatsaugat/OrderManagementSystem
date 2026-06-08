package com.saugat.oms.mapper;

import com.saugat.oms.dto.CartDto;
import com.saugat.oms.entity.Cart;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {UserMapper.class, ProductMapper.class})
public abstract class CartMapper implements IBaseMapper<Cart, CartDto> {
}
