//******************************************************************
//系统名称：Junit
//模块名称：TODO
//版本信息
//版本:1.0    日期:2019年1月24日    作者:唐亮     备注:新建
//******************************************************************
package cn.ox0a.junit.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import cn.ox0a.junit.base.MockBase;

/**
 * <b>概述</b>：
 * <blockquote>演示未登录时请求返回</blockquote>
 * <p/>
 * @author  <a href="mailto:1284676837@qq.com">唐亮</a>
 **/
public class IndexControl2Test extends MockBase{

    /**
     * Test method for {@link IndexControl#getPort()}.
     * @throws Exception 
     */
    @Test
    public void testGetPort() throws Exception {
        getMockMvc().perform(MockMvcRequestBuilders.post("/index/port"))
            .andDo(MockMvcResultHandlers.print());
    }

}
