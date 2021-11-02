package io.joework.servermanagementserverapis.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.joework.servermanagementserverapis.domain.Server;

public interface ServerRepository extends JpaRepository<Server,Long> {
    Optional<Server> findServerByIpAddress(String ipAddress );
}
