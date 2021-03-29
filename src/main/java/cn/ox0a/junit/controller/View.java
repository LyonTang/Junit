//******************************************************************
//系统名称：Junit
//模块名称：TODO
//版本信息
//版本:1.0    日期:2019年1月23日    作者:唐亮     备注:新建
//******************************************************************
package cn.ox0a.junit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <b>概述</b>：
 * <blockquote>视图</blockquote>
 * <p/>
 * @author  <a href="mailto:1284676837@qq.com">唐亮</a>
 **/
@Controller
public class View {
    @RequestMapping(value="/user/signin", method=RequestMethod.GET)
    public String signIn() {
        return "signin";
    }
    
    @RequestMapping(value="/index", method=RequestMethod.GET)
    public String index() {
        return "index";
    }
}
