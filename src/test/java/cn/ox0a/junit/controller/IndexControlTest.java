//******************************************************************
//系统名称：Junit
//模块名称：TODO
//版本信息
//版本:1.0    日期:2019年1月23日    作者:唐亮     备注:新建
//******************************************************************

package cn.ox0a.junit.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import cn.ox0a.junit.base.LoginBase;

/**
 * <b>概述</b>： <blockquote>演示登陆后的请求返回</blockquote>
 * <p/>
 * 
 * @author <a href="mailto:1284676837@qq.com">唐亮</a>
 **/
public class IndexControlTest extends LoginBase {

    /**
     * Test method for
     * {@link IndexControl#getPort()}.
     * 
     * @throws Exception
     */
    @Test
    public void testGetPort() throws Exception {
        getMockMvc().perform(MockMvcRequestBuilders.post("/index/port").session(  // 关键，需设置登陆的session
                getSession())).andDo(MockMvcResultHandlers.print());
    }

}
