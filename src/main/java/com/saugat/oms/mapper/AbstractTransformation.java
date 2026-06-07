package com.saugat.oms.mapper;

import com.saugat.oms.entity.User;
import com.saugat.oms.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public abstract class AbstractTransformation {

    @Named("userTransformation")
    public UserDto userTransformation(User user){
        return user == null ? null : new UserDto(user.getId(), null, null, null, null, null);
    }
}