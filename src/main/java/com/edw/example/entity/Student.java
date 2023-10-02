package com.edw.example.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * <pre>
 *     com.edw.example.entity.Student
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 02 Okt 2023 09:16
 */
@Entity(name = "T_STUDENT")
public class Student extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nama;
    private Integer age;

    public Student() {
    }

    public Student(Long id, String nama, Integer age) {
        this.id = id;
        this.nama = nama;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
