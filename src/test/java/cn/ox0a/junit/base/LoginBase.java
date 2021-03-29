/**
 * 
 */

package cn.ox0a.junit.base;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.junit.Before;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.alibaba.fastjson.JSON;

/**
 * 
 * @author tangliang
 * 
 */
public abstract class LoginBase extends MockBase {
    private MockHttpSession session;

    protected MockHttpSession getSession() {
        return this.session;
    }

    @Before
    public void setUp() {
        super.setUp();
        this.session = (MockHttpSession) login();
    }

    public HttpSession login() {
        String url = "/user/signin";
        Map<String, String> map = new HashMap<String, String>();
        MultiValueMap<String, String> user = new LinkedMultiValueMap<>();
        map.put("username", "leon");
        map.put("password", "leon");
        MvcResult result = null;
        try {
            result = getMockMvc().perform(MockMvcRequestBuilders.post(url)
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(JSON.toJSONString(map)))
                    //.andDo(MockMvcResultHandlers.print())
                    .andReturn();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result != null ? result.getRequest().getSession() : null;
    }
}
