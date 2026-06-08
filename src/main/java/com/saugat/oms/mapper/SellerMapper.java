package com.saugat.oms.mapper;

import com.saugat.oms.dto.SellerDto;
import com.saugat.oms.entity.Seller;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {UserMapper.class})
public abstract class SellerMapper implements IBaseMapper<Seller, SellerDto> {
}
