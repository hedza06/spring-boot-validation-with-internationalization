package com.springboot.internationalization.entities;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.context.annotation.Description;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "user")
@DynamicInsert
@DynamicUpdate
@Description("User entity representation")
public class User implements Serializable {

    private static final long serialVersionUID = 20191020101100L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @NotNull(message = "{fullName.not-null}")
    @NotEmpty(message = "{fullName.not-empty}")
    @NotBlank(message = "{fullName.not-blank}")
    @Size(min = 1, max = 128, message = "{fullName.invalid-size}")
    @Column(name = "full_name", nullable = false, length = 128)
    private String fullName;

    @NotNull(message = "{age.not-null}")
    @Column
    private Integer age;

    @Column
    private String address;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
