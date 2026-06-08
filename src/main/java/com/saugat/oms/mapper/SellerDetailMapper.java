package com.saugat.oms.mapper;

import com.saugat.oms.controller.SellerDetail;
import com.saugat.oms.dto.SellerDetailDto;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {SellerMapper.class})
public abstract class SellerDetailMapper implements IBaseMapper<SellerDetail, SellerDetailDto> {
}
