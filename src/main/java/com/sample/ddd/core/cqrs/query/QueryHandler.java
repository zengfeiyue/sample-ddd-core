package com.sample.ddd.core.cqrs.query;


/**
 * 查询处理器接口
 *
 * @author laiqiao
 */
public interface QueryHandler<Q extends Query<R>, R> {

    /**
     * 查询逻辑
     *
     * @param query
     * @return
     */
    R handle(Q query);
}
