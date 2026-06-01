package com.saugat.oms.mapper;

import com.saugat.oms.entity.User;
import com.saugat.oms.wrapper.UserVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = IMapperConfig.class, uses = {})
public abstract class UserMapper implements IBaseMapper<User, UserVo> {

    @Mapping(target = "email", ignore = true )
    @Mapping(target = "pass", ignore = true )
    @Mapping(target = "mobile", ignore = true )
    public abstract UserVo toDto(User user);

}