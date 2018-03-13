package com.bdqn.controller;

import com.bdqn.service.EmpInfoService;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/empInfoServlet")
public class EmpInfoServlet extends HttpServlet {
    private EmpInfoService empInfoService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入doget.....");
        //System.out.println(empInfoService.getList());
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        empInfoService=(EmpInfoService) ac.getBean("empInfoService");
        System.out.println(empInfoService.getList());
    }
}
