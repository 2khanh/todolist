package io.khanh.todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Table(name = "tasks")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "title", nullable = false)
    String title;

    @Column(name = "description")
    String description;

    @Column(name = "create_at")
    Date createAt;

    @Column(name = "update_at")
    Date updateAt;

}
