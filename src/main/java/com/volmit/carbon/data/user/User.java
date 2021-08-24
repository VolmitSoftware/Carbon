package com.volmit.carbon.data.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Accessors(chain = true, fluent = true)
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "discord_id", nullable = false, unique = true)
    private Long discordId;

    @Column(name = "experience")
    private Long experience;

    @Column(name = "points")
    private Long points;
}