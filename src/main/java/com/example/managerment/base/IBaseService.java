package com.example.managerment.base;

import java.io.Serializable;
import java.util.List;

public interface IBaseService<T> {

    /**
     * 保存
     *
     * @param entity e
     * @throws Exception e
     */
    void save(T entity) throws Exception;

    /**修改*/
    void update(T entity) throws Exception;

    /**删除*/
    void deleteById(Serializable id) throws Exception;

    /**id查询*/
    T getById(Serializable id) throws Exception;

    /**查询（where）*/
    List<T> getByWhere(ObjectQuery objectQuery) throws Exception;

    /**查询（all）*/
    List<T> getAll() throws Exception;

    /**查询(分页 查询)*/
    PageResult<T> findPage(ObjectQuery queryObject) throws Exception;

    /**查询总条数*/
    Integer findCount(ObjectQuery objectQuery) throws Exception;

}
