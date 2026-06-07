package com.saugat.oms.mapper;

import com.saugat.oms.entity.Country;
import com.saugat.oms.wrapper.CountryVo;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {})
public interface CountryMapper extends IBaseMapper<Country, CountryVo> {
}
