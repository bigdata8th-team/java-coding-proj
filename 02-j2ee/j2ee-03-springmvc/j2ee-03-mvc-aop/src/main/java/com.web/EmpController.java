package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmpController {
    /**
     * 查询员工
     */
    @RequestMapping("/findEmp.do")
    public String find() {
        // 模拟查询员工数据
        System.out.println("查询员工数据，发送至列表页面.");
        
        return "emp/emp_list";
    }
}