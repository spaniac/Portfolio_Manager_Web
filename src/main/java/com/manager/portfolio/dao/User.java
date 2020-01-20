package com.manager.portfolio.dao;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String email;
    String password;
    @Column(name = "created_datetime")
    @CreatedDate
    DateTime createdDateTime;
    @Column(name = "recent_login_datetime")
    @CreatedDate
    DateTime recentLoginDateTime;

    protected User(){}

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.createdDateTime = new DateTime();
        this.recentLoginDateTime = new DateTime();
    }

}
