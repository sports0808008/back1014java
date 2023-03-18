package com.qq.mapper;

import com.qq.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> getList();

    Student selectOne(int id);


}
