package com.saugat.oms.mapper;

import com.saugat.oms.dto.UserPhoneDto;
import com.saugat.oms.entity.UserPhone;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {UserMapper.class, PhoneMapper.class})
public abstract class UserPhoneMapper implements IBaseMapper<UserPhone, UserPhoneDto>{
}
