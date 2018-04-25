package com.qmkj.PO;

/**
 * @Description:
 * @Author: wuqs
 * @CreateDate: 2018/4/24 13:51
 */
public class UserPO {
    //主键
    private Integer id;

    //姓名
    private String name;

    //年龄
    private Integer age;

    //性别
    private String sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
