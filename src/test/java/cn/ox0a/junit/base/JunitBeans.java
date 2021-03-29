package cn.ox0a.junit.base;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * <b>概述</b>：
 * <blockquote>添加一些测试所必要的Beans</blockquote>
 * <p/>
 * <b>功能</b>：
 * <blockquote>如下示例为使用RestTemplate，在1.5.2中需要添加bean</blockquote>
 * @author  <a href="mailto:1284676837@qq.com">唐亮</a>
 *
 */
@Component
public class JunitBeans {
    
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
