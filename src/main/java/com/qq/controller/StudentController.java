package com.qq.controller;

import com.qq.model.Student;

import com.qq.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

//控制层---服务层---数据访问层

//控制器类 标记（注解）
//允许JS跨域
@CrossOrigin
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired //自动注入
    StudentService studentService;


    @ResponseBody
    @RequestMapping("/getList")
    List<Student> getList() {//List是接口
        return studentService.getList();
    }
    //前端发请求必须注解CrossOrigin
//        @CrossOrigin//允许JS跨域
        @ResponseBody
        @RequestMapping("/xxx")
        String xxx() {//List是接口
            return "西门吹雪";
        }
//        System.out.println("getList()被调用");
//        Student stu1 = new Student(1, "小明", "男", 18);
//        Student stu2 = new Student(2, "小王", "男", 25);
//        Student stu3 = new Student(3, "小红", "女", 20);
//        Student stu4 = new Student(4, "小猪", "女", 22);
//        List<Student> students = new ArrayList<Student>();//ArrayList是List的子类  具体的等于抽象是（动物（抽象的）=狗 狗是动物）
//        students.add(stu1);
//        students.add(stu2);
//        students.add(stu3);
//        students.add(stu4);
//        return students;//RequestMapping找jsp页面返回客服端，没有这个页面  所以需要@ResponseBody把hello 返回客服端


        @ResponseBody
        @RequestMapping("/getone")
        Student getOne ( int id){
            System.out.println("你输入的id是" + id);
//        Student stu0 = new Student();//无参构造方法（对象）
//        stu0.setId(100);
//        stu0.setName("Tom");
//        stu0.setSex("女");
//        stu0.setAge(666);

            //  StudentService  <- Student stu1=new Student("李四","女",22);//三参构造
//        Student stu2=new Student(1,"王五","男",25);//四参构造

//        System.out.println(stu1);//地址(用tostring转换)

//        System.out.println(stu1.getSex());

//        System.out.println(stu1);
//
//
//        return stu1;//构造方法

//        Student stu = studentService.makeOne();
//        return stu;
            return studentService.makeOne(id);


        }


    }
