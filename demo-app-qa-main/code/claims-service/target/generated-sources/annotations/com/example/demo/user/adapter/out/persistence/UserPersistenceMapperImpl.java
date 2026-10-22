package com.example.demo.user.adapter.out.persistence;

import com.example.demo.user.domain.Email;
import com.example.demo.user.domain.User;
import com.example.demo.user.domain.UserId;
import com.example.demo.user.domain.UserRole;
import java.time.Instant;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-22T22:58:47+0530",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.10 (Oracle Corporation)"
)
@Component
public class UserPersistenceMapperImpl implements UserPersistenceMapper {

    @Override
    public UserJpaEntity toJpaEntity(User user) {
        if ( user == null ) {
            return null;
        }

        UUID id = null;
        String email = null;
        String name = null;
        UserRole role = null;
        Instant createdAt = null;

        id = userUserIdValue( user );
        email = userEmailValue( user );
        name = user.getName();
        role = user.getRole();
        createdAt = user.getCreatedAt();

        UserJpaEntity userJpaEntity = new UserJpaEntity( id, email, name, role, createdAt );

        return userJpaEntity;
    }

    private UUID userUserIdValue(User user) {
        UserId userId = user.getUserId();
        if ( userId == null ) {
            return null;
        }
        return userId.value();
    }

    private String userEmailValue(User user) {
        Email email = user.getEmail();
        if ( email == null ) {
            return null;
        }
        return email.value();
    }
}
