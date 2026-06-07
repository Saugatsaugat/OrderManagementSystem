package com.saugat.oms.mapper;

import com.saugat.oms.entity.Country;
import com.saugat.oms.dto.CountryDto;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {})
public interface CountryMapper extends IBaseMapper<Country, CountryDto> {
}
