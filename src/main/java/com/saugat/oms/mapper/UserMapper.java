package com.saugat.oms.mapper;

import com.saugat.oms.entity.User;
import com.saugat.oms.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = IMapperConfig.class, uses = {})
public abstract class UserMapper implements IBaseMapper<User, UserDto> {

    @Mapping(target = "email", ignore = true )
    @Mapping(target = "pass", ignore = true )
    @Mapping(target = "mobile", ignore = true )
    public abstract UserDto toDto(User user);

}