package com.qq.model;

//实体类
public class Student {

   private Integer id; //Integer对象默认值null 而用int是0
   private String name;
   private String sex;
   private Integer age;


   public Student() {
   }

   public Student(Integer id, String name, String sex, Integer age) {
      this.id = id;
      this.name = name;
      this.sex = sex;
      this.age = age;
   }
   public Student( String name, String sex, Integer age) {
      this.name = name;
      this.sex = sex;
      this.age = age;
   }

   /**
    * 获取
    * @return id
    */
   public Integer getId() {
      return id;
   }

   /**
    * 设置
    * @param id
    */
   public void setId(Integer id) {
      this.id = id;
   }

   /**
    * 获取
    * @return name
    */
   public String getName() {
      return name;
   }

   /**
    * 设置
    * @param name
    */
   public void setName(String name) {
      this.name = name;
   }

   /**
    * 获取
    * @return sex
    */
   public String getSex() {
      return sex;
   }

   /**
    * 设置
    * @param sex
    */
   public void setSex(String sex) {
      this.sex = sex;
   }

   /**
    * 获取
    * @return age
    */
   public Integer getAge() {
      return age;
   }

   /**
    * 设置
    * @param age
    */
   public void setAge(Integer age) {
      this.age = age;
   }

   @Override//覆盖 （内置object是对象的地址要用tostring转）
   public String toString() {
      return "Student{id = " + id + ", name = " + name + ", sex = " + sex + ", age = " + age + "}";
   }
}
