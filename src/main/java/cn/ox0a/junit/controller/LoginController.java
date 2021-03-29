//******************************************************************
//系统名称：Junit
//模块名称：TODO
//版本信息
//版本:1.0    日期:2019年1月23日    作者:唐亮     备注:新建
//******************************************************************
package cn.ox0a.junit.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import cn.ox0a.junit.adapter.WebSecurityAdapter;
import cn.ox0a.junit.domain.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>概述</b>：
 * <blockquote>登陆逻辑</blockquote>
 * <p/>
 * @author  <a href="mailto:1284676837@qq.com">唐亮</a>
 **/
@RestController
@RequestMapping("/user")
public class LoginController {
    
    @RequestMapping(value="signin", method=RequestMethod.POST)
    public Map<String, Object> signIn(@RequestBody User user, HttpSession session, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        if("leon".equals(user.getUsername()) && "leon".equals(user.getPassword())) {
            session.setAttribute(WebSecurityAdapter.KEY, user.getUsername());
            map.put("success", true);
            map.put("msg", "Log In Succeed");
        }else {
            map.put("success", false);
            map.put("msg", "Log In Failed");
        }
        return map;
    }
}
