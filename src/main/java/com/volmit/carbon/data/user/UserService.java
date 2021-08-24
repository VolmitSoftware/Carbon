package com.volmit.carbon.data.user;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class UserService {
    private final UserRepository repository;

    public User saveUser(User user)
    {
        if(!repository.existsById(user.id()))
        {
            throw new SecurityException("Cannot create users in saveUser. Use createUser()");
        }

        return repository.save(user);
    }

    public User createUser(Long discordId)
    {
        return repository.save(new User().discordId(discordId));
    }
}
