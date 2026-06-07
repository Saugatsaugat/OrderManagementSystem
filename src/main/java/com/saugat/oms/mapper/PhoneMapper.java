package com.saugat.oms.mapper;

import com.saugat.oms.entity.Phone;
import com.saugat.oms.wrapper.PhoneVo;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {})
public abstract class PhoneMapper implements IBaseMapper<Phone, PhoneVo> {
}
