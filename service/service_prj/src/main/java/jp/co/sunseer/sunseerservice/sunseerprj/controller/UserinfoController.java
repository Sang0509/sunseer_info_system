package jp.co.sunseer.sunseerservice.sunseerprj.controller;


import jp.co.sunseer.sunseerservice.sunseerprj.entity.Userinfo;
import jp.co.sunseer.sunseerservice.sunseerprj.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Group A
 * @since 2021-05-17
 */
@RestController
@RequestMapping("/sunseerprj/userinfo")
public class UserinfoController {

    @Autowired
    private UserinfoService userinfoService;

    @GetMapping("/all")
    public List<Userinfo> testUser(){
        System.out.println(("--------------selectAll method test --------------"));
        return userinfoService.list(null);
    }

}

