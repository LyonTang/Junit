//******************************************************************
//系统名称：Junit
//模块名称：TODO
//版本信息
//版本:1.0    日期:2019年1月23日    作者:唐亮     备注:新建
//******************************************************************
package cn.ox0a.junit.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * <b>概述</b>：
 * <blockquote>UUID TEST</blockquote>
 * <p/>
 * @author  <a href="mailto:1284676837@qq.com">唐亮</a>
 **/
public class UUIDUtilsTest {

    @Test
    public void test() {
        Assert.assertNotNull(UUIDUtils.generate());
    }

}
