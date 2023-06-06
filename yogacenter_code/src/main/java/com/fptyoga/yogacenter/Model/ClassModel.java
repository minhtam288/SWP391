package com.fptyoga.yogacenter.Model;

import com.fptyoga.yogacenter.Entity.Course;
import com.fptyoga.yogacenter.Entity.User;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ClassModel {
    private Long class_id;
    private String class_name;
    private String status;
    private Course course;
    private User user;

}