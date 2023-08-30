package com.sample.ddd.core.cqrs.query;

/**
 * 查询总线接口
 *
 * @author laiqiao
 */
public interface QueryBus {
    /**
     *
     * @param query
     * @param <R>
     * @return
     */
    <R> R dispatch(Query<R> query);

}
