package com.saugat.oms.mapper;

import com.saugat.oms.entity.Country;
import com.saugat.oms.dto.CountryDto;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {})
public abstract class CountryMapper implements IBaseMapper<Country, CountryDto> {
}
