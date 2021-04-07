package online.wenmeng.controller;

import online.wenmeng.exception.ParameterErrorException;
import online.wenmeng.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
public class TestController extends BaseController {

    @Autowired
    private TestService testService;

    /**
     * 测试登录
     */
    @RequestMapping("testLogin/{id}")
    public Map<String,Object> testLogin(HttpSession session, @PathVariable("id") int id) throws ParameterErrorException {
        return testService.testLogin(session,id);
    }
}
