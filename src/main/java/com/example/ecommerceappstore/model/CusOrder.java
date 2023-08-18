package com.example.ecommerceappstore.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class CusOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id",nullable = false)
    private LocalUser user;
    @ManyToOne(optional = false)
    @JoinColumn(name = "address",nullable = false)
    private Address address;

    @OneToMany(mappedBy = "cusOrder", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<CusOrderQuantity> quantities = new ArrayList<>();


}
