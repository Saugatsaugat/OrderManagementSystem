package com.saugat.oms.mapper;

import com.saugat.oms.dto.RoleDto;
import com.saugat.oms.entity.Role;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {})
public abstract class RoleMapper implements IBaseMapper<Role, RoleDto> {
}
