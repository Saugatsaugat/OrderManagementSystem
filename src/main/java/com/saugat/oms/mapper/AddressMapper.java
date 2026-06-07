package com.saugat.oms.mapper;

import com.saugat.oms.entity.Address;
import com.saugat.oms.wrapper.AddressVo;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {CountryMapper.class})
public abstract class AddressMapper implements IBaseMapper<Address, AddressVo>{
}
