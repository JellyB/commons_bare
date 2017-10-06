package com.huatu.common.spring.cache;

import com.huatu.common.spring.event.AllReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;

/**
 * @author hanchao
 * @date 2017/10/6 9:57
 */
public class CachedInfosBuilder implements ApplicationListener<AllReadyEvent> {
    @Override
    public void onApplicationEvent(AllReadyEvent event) {
        ApplicationContext applicationContext = event.getApplicationContext();
        // TODO
    }
}
