package com.saugat.oms.mapper;

import com.saugat.oms.entity.User;
import com.saugat.oms.wrapper.UserVo;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public abstract class AbstractTransformation {

    @Named("userTransformation")
    public UserVo userTransformation(User user){
        return user == null ? null : new UserVo(user.getId(), null, null, null);
    }
}