package com.xuyang.springboot.exam.config;

import org.springframework.session.data.redis.RedisFlushMode;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @Auther: xuyang
 * @Date: 2019/11/3 20:54
 * @Description: spring-session集成
 */
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1800,
        redisFlushMode = RedisFlushMode.ON_SAVE,
        redisNamespace = "exam")
public class SpringSessionConfig {
}
