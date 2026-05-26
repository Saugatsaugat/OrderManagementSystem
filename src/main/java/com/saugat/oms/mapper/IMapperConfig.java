package com.saugat.oms.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.MapperConfig;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.ReportingPolicy;

@MapperConfig(componentModel = "spring", uses = {AbstractTransformation.class}, nullValueMapMappingStrategy = NullValueMappingStrategy.RETURN_NULL, unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE, injectionStrategy = InjectionStrategy.CONSTRUCTOR, disableSubMappingMethodsGeneration = true)
public interface IMapperConfig {
}