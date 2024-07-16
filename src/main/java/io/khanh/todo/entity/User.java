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

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid")
    String uuid;

    @Column(name = "username", length = 50, unique = true, nullable = false)
    String username;

    @Column(name = "password", nullable = false)
    String password;

    @Column(name = "email", unique = true, nullable = false)
    String email;

    @Column(name = "phone_number", length = 20, unique = true)
    String phoneNumber;

    @Column(name = "first_name", length = 100)
    String firstName;

    @Column(name = "last_name", length = 100)
    String lastName;

    @Column(name = "birthday")
    LocalDate birthday;

    @Column(name = "create_at")
    Date createAt;

    @Column(name = "update_at")
    Date updateAt;

}
