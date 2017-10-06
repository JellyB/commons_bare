package com.huatu.common.spring.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * 延迟启动事件
 * @author hanchao
 * @date 2017/10/6 10:19
 */
public class AllReadyEvent extends ApplicationContextEvent {
    /**
     * Create a new ContextStartedEvent.
     *
     * @param source the {@code ApplicationContext} that the event is raised for
     *               (must not be {@code null})
     */
    public AllReadyEvent(ApplicationContext source) {
        super(source);
    }
}
