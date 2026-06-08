package com.saugat.oms.mapper;

import com.saugat.oms.dto.CartItemDto;
import com.saugat.oms.entity.CartItem;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {CartMapper.class})
public abstract class CartItemMapper implements IBaseMapper<CartItem, CartItemDto> {
}
