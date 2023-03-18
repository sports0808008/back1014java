package com.qq.service;

import com.qq.mapper.StudentMapper;
import com.qq.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentService {
    @Autowired
//  @Autowired等于@Resource

    StudentMapper studentMapper;

    public List<Student> getList() {
        return studentMapper.getList();
    }

    public Student makeOne(int id) {

        //要从数据库
        //return new Student("李四", "男", 26);

//        Student stu = studentMapper.selectOne();
//        return stu; 等于return studentMapper.selectOne();

        return studentMapper.selectOne(id);
    }


}
