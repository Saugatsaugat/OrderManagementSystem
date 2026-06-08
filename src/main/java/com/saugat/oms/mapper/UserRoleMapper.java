package com.saugat.oms.mapper;

import com.saugat.oms.dto.UserRoleDto;
import com.saugat.oms.entity.UserRole;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {UserMapper.class, RoleMapper.class})
public abstract class UserRoleMapper implements IBaseMapper<UserRole, UserRoleDto> {
}
