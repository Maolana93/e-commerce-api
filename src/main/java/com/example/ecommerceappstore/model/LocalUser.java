package com.example.ecommerceappstore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "local_user")
@AllArgsConstructor
@NoArgsConstructor
public class LocalUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "user_name", nullable = false,unique = true)
    private String userName;

    @Column(name = "password", nullable = false,length = 1000)
    private String password;

    @Column(name = "email", nullable = false,unique = true,length = 255)
    private String Email;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @OneToMany(mappedBy = "localUser",cascade = CascadeType.REMOVE,orphanRemoval = true)
    private List<Address> addresses=new ArrayList<>();
}
