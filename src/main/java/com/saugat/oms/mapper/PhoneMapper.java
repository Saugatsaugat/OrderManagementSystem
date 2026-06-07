package com.saugat.oms.mapper;

import com.saugat.oms.entity.Phone;
import com.saugat.oms.dto.PhoneDto;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {})
public abstract class PhoneMapper implements IBaseMapper<Phone, PhoneDto> {
}
