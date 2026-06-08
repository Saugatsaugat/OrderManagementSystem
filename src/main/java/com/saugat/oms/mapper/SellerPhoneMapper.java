package com.saugat.oms.mapper;

import com.saugat.oms.dto.SellerPhoneDto;
import com.saugat.oms.entity.SellerPhone;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {SellerMapper.class, PhoneMapper.class})
public abstract class SellerPhoneMapper implements IBaseMapper<SellerPhone, SellerPhoneDto> {
}
