package com.example.demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author yrk
 * @date 2020/5/10 - 11:45
 * 两者为属性注入的方式：批量注入：1、@ConfigurationProperties(prefix = "person")
 *   2、单个注入：@Value("xxx")
 *   区别：@ConfigurationProperties不支持ELSp表达式
 *        @Value支持ELSp表达式
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    /**
     * @Value("${}") 可以获取对应属性文件中定义的属性值
     */
   // @Value("${person.lastName}")
    private String lastName;
    /**
     * @Value("#{}"): SpEL表达式
     * 通常用来获取bean的属性，或者调用bean的某个方法。当然还有可以表示常量
     */

    //@Value("#{dog.dog()}")
    private String firstName;
    private Date birth;
    private Map maps;
    private List list;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map getMaps() {
        return maps;
    }

    public void setMaps(Map maps) {
        this.maps = maps;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birth=" + birth +
                ", maps=" + maps +
                ", list=" + list +
                '}';
    }
}
