package com.lcj.controller;

import com.lcj.domain.User;
import com.lcj.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static com.lcj.controller.Code.GET_ERR;
import static com.lcj.controller.Code.GET_OK;

/**
 * @description:
 * @author: 李传江
 * @date: 2022/11/17
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping
    public Result save(@RequestBody User user) {
        boolean flag = userService.save(user);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody User user) {
        boolean flag = userService.update(user);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = userService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        User user = userService.getById(id);
        Integer code = user != null ? GET_OK : GET_ERR;
        String msg = user != null ? "" : "查询失败,请重试!";
        return new Result(code, msg, user);
    }

    @GetMapping
    public Result getAll() {
        int i=1/0;
        List<User> userList = userService.getAll();
        Integer code = userList != null ? GET_OK : GET_ERR;
        String msg = userList != null ? "" : "查询失败,请重试!";
        return new Result(code, msg, userList);
    }
}
