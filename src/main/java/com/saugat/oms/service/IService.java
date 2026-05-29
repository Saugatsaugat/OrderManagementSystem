package com.saugat.oms.service;

import java.util.List;

public interface IService<W, ID> {

    W get(ID id);

    List<W> getAll();

    W create(W vo);

    W edit(W vo, ID id);

    void delete(ID id);
}