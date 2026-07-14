package com.saugat.oms.mapper;

import com.saugat.oms.dto.OrderDetailDto;
import com.saugat.oms.entity.OrderDetail;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {OrderMapper.class, ProductMapper.class})
public abstract class OrderDetailMapper implements IBaseMapper<OrderDetail, OrderDetailDto> {
}
