package com.saugat.oms.mapper;

import com.saugat.oms.dto.OrderDto;
import com.saugat.oms.entity.Order;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses ={UserMapper.class, AddressMapper.class})
public abstract class OrderMapper implements IBaseMapper<Order, OrderDto> {
}
