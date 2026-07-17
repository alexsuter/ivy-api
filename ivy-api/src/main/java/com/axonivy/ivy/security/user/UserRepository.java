package com.axonivy.ivy.security.user;

import java.util.stream.Stream;

// scoped by security context
public interface UserRepository  {

    User findByUuid(String uuid);
    User findByName(String name);

    Stream<User> all();

    delete(String uuid);    
    create(NewUser user);
    update(UpdateUser user);
}
