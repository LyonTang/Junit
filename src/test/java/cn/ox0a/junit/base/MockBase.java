/**
 * 
 */
package cn.ox0a.junit.base;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import cn.ox0a.junit.Junit4App;

/**
 * abstract
 * Web Controller测试可继承类 
 * @author tangliang
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=Junit4App.class)
@WebAppConfiguration
public abstract class MockBase {
   @Autowired
   private WebApplicationContext context;
   
   private MockMvc mockMvc;
   
   protected MockMvc getMockMvc() {
       return this.mockMvc;
   }
   
   @Before
   public  void setUp() {
       this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
   }
}
