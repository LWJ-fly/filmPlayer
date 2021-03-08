package online.wenmeng.controller;

import online.wenmeng.exception.ServerException;
import online.wenmeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Auther: 狼芒
 * @Date: 2020/12/19 0:15
 * @Descrintion:
 * @version: 1.0
 */
@RestController
public class UserControler {

    @Autowired
    private UserService userService;

    /**
     * 用户登录调用
     * @param session 服务器获取
     * @param code 用户传输的QQ登录码
     * @return 返回用户登录信息(昵称，性别，头像链接)
     *              如果错误会给出错误信息
     *                  一般是code错误
     *                  也会有限制用户登录、当前用户被禁用
     */
    @RequestMapping("/login/{code}")
    public Map<String,Object> login(HttpSession session, @PathVariable("code") String code) throws ServerException {
        return userService.login(session, code);
    }

    /**
     * 退出登录
     * @return
     */
    @RequestMapping("/exit")
    public Map<String,Object> exit(HttpSession session){
        return userService.exit(session);
    }


    /**
     * 查询个人信息
     */
    @RequestMapping("/getUserInfo/{userId}")
    public Map<String,Object> getUserInfo(@PathVariable("userId") int userId){
        return userService.getUserInfo(userId);
    }


    /**
     * 查询个人信息
     */
    @RequestMapping("/getUserInfo")
    public Map<String,Object> getUserInfo(HttpSession session){
        return userService.getUserInfo(session);
    }

    /**
     * 修改个人信息，只能修改登录的用户信息
     * @param gender 性别
     * @param qq    QQ号
     * @param phone 手机号
     * @return  返回更新后的用户信息
     */
    @RequestMapping("/changeUserInfo/{gender}/{qq}/{phone}")
    public Map<String,Object> changeUserInfo(HttpSession session,@PathVariable("gender") String gender,@PathVariable("qq") String qq ,@PathVariable("phone") String phone){
        return userService.changeUserInfo(session,gender,qq, phone);
    }
}
