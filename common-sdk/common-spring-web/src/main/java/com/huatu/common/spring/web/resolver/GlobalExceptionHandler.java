package com.huatu.common.spring.web.resolver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.HandlerExceptionResolver;

/**
 * //TODO
 * @author hanchao
 * @date 2017/8/31 20:52
 */
@ControllerAdvice
@ConditionalOnMissingBean(HandlerExceptionResolver.class)
@Slf4j
public class GlobalExceptionHandler {
}
