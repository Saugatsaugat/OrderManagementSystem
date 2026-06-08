package com.saugat.oms.mapper;

import com.saugat.oms.dto.UserDetailDto;
import com.saugat.oms.entity.UserDetail;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {UserMapper.class})
public abstract class UserDetailMapper implements IBaseMapper<UserDetail, UserDetailDto> {
}
