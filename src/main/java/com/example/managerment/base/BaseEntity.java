package com.example.managerment.base;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    protected static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
