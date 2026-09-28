package com.authService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

@Table()
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "roll_id")
    private long roleId;
    private String name;

    public UserRole(long roleId, String name) {
        this.roleId = roleId;
        this.name = name;
    }

}
