/**
 * v1.0
 */
package cn.ox0a.junit.base;

import cn.ox0a.junit.Junit4App;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * abstract
 * 测试基类，Junit需要Spring Boot环境时实现
 * @author tangliang
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Junit4App.class)
public abstract class SpringTestBase {
    
}
