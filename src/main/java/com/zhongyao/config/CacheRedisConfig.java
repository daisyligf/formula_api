package com.zhongyao.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author daisyli
 * @create 下午3:26
 **/
//@Configuration
public class CacheRedisConfig {

    private Logger logger = LoggerFactory.getLogger(CacheRedisConfig.class);


//    @Bean
//    @ConditionalOnMissingBean
//    public StringRedisTemplate stringRedisTemplate(JedisConnectionFactory jedisConnectionFactory) {
//        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate(jedisConnectionFactory);
//        return stringRedisTemplate;
//    }

//    @Bean
//    @ConditionalOnMissingBean
//    public StringTemplate stringTemplate(StringRedisTemplate stringRedisTemplate) {
//        if (stringRedisTemplate == null) {
//            throw new RuntimeException("无法初始化stringRedisTemplate .... ");
//        }
//
//        logger.info("stringRedisTemplate : {}", stringRedisTemplate);
//        StringTemplate stringTemplate = new StringTemplate(stringRedisTemplate);
//        return stringTemplate;
//    }
//
//    @Bean
//    @ConditionalOnMissingBean
//    public ObjectTemplate objectTemplate(StringTemplate stringTemplate) {
//        ObjectTemplate objectTemplate = new ObjectTemplate(stringTemplate);
//        return objectTemplate;
//    }
//
//    @Bean
//    @ConditionalOnMissingBean
//    public JedisTemplate jedisTemplate(ObjectTemplate objectTemplate, StringTemplate stringTemplate) {
//        JedisTemplate jedisTemplate = new JedisTemplate(stringTemplate, objectTemplate);
//        return jedisTemplate;
//    }


}

