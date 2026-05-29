package com.saugat.oms.service;

import com.saugat.oms.exceptions.ResourceNotFoundException;
import com.saugat.oms.mapper.IBaseMapper;
import com.saugat.oms.entity.PKEntity;
import com.saugat.oms.repo.IBaseRepo;
import com.saugat.oms.wrapper.PKEntityVo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public abstract class AbstractService<E extends PKEntity, W extends PKEntityVo, ID> implements IService<W, ID> {

    public abstract String getServiceName();

    public abstract IBaseRepo<E, ID> getRepository();

    public abstract IBaseMapper<E, W> getMapper();

    @Transactional(readOnly = true)
    public W get(ID id) {
        E obj = getRepository()
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("GET Method: For Id = " + id + "," + getServiceName() + " not found"));
        return getMapper().toDto(obj);
    }

    @Transactional(readOnly = true)
    public List<W> getAll() {
        List<E> dataList = getRepository().findAll();
        return getMapper().toDtos(dataList);
    }

    @Transactional
    public W create(W vo) {
        E savedData = getRepository().save(getMapper().fromDto(vo));
        return getMapper().toDto(savedData);
    }

    @Transactional
    public W edit(W vo, ID id) {
        E existingData = getRepository()
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("EDIT Method: For Id = " + id + "," + getServiceName() + " not found"));
        vo.setId(existingData.getId());
        E savedData = getRepository().save(getMapper().fromDto(vo));
        return getMapper().toDto(savedData);
    }

    @Transactional
    public void delete(ID id) {
        E existingData = getRepository()
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DELETE Method: For Id = " + id + "," + getServiceName() + " not found"));
        getRepository().delete(existingData);
    }

}