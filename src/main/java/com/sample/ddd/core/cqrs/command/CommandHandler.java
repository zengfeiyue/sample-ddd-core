package com.sample.ddd.core.cqrs.command;

/**
 * 命令处理器
 *
 * @author laiqiao
 */
public interface CommandHandler<C extends Command> {

    /**
     * 处理逻辑
     *
     * @param command
     */
    void handle(C command);
}
