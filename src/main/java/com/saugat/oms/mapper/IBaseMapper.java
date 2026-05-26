package com.saugat.oms.mapper;

import com.saugat.oms.entity.PKEntity;
import com.saugat.oms.wrapper.PKEntityVo;
import org.mapstruct.InheritInverseConfiguration;

import java.util.List;

public interface IBaseMapper<E extends PKEntity, W extends PKEntityVo> {
    W toDto(E e);

    @InheritInverseConfiguration
    E fromDto(W v);

    List<W> toDtos(List<E> e);

    List<E> fromDtos(List<W> v);

}