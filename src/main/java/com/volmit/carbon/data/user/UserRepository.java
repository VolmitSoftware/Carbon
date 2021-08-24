package com.volmit.carbon.data.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByDiscordId(Long discordId);
}