//******************************************************************
//系统名称：Junit
//模块名称：TODO
//版本信息
//版本:1.0    日期:2019年1月23日    作者:唐亮     备注:新建
//******************************************************************
package cn.ox0a.junit.adapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * <b>概述</b>：
 * <blockquote>登陆验证器</blockquote>
 * <p/>
 * @author  <a href="mailto:1284676837@qq.com">唐亮</a>
 **/
@Configuration
public class WebSecurityAdapter extends WebMvcConfigurerAdapter{
    
    public final static String KEY = "LEON";
    
    /**
     * 
     * <b>功能</b>：<br/>
     *  get
     * @return 拦截处理器实例
     */
    @Bean
    public WebHandler webHandler() {
        return new WebHandler();
    }
    
    /**
     * 
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry)
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(webHandler());
        
        registration.excludePathPatterns("/error");
        registration.excludePathPatterns("/user/**");
        
        registration.addPathPatterns("/**");
    }
    
    /**
     * 
     * <b>概述</b>：
     * <blockquote>添加处理操作</blockquote>
     * <p/>
     * @author  <a href="mailto:1284676837@qq.com">唐亮</a>
     *
     */
    private class WebHandler extends HandlerInterceptorAdapter {
        
        /**
         * 响应前处理
         * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
         */
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
            HttpSession session = request.getSession();
            
            if(session.getAttribute(KEY) != null) {
                return true;
            }
            
            String url = "/user/signin";
            response.sendRedirect(url);
            return false;
        }
    }
}
