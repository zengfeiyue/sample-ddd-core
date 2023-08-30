package com.sample.ddd.core.cqrs.command;

/**
 * 命令总线接口
 * @author laiqiao
 */
public interface CommandBus {

    /**
     *
     * @param command
     */
    void dispatch(Command command);

}
