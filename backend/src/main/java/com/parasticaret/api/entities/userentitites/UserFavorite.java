package com.parasticaret.api.entities.userentitites;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class UserFavorite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(mappedBy = "userFavorite", fetch = FetchType.LAZY)
    private Set<UserFavoriteItem> userFavoriteItems;


}
