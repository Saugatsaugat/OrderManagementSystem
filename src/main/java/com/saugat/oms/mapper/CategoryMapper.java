package com.saugat.oms.mapper;

import com.saugat.oms.dto.CategoryDto;
import com.saugat.oms.entity.Category;
import org.mapstruct.Mapper;

@Mapper(config = IMapperConfig.class, uses = {})
public abstract class CategoryMapper implements IBaseMapper<Category, CategoryDto>{
}
