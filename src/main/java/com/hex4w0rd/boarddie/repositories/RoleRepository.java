package com.hex4w0rd.boarddie.repositories;

import com.hex4w0rd.boarddie.entities.Role;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
<<<<<<< Updated upstream:src/main/java/com/hex4w0rd/boarddie/repositories/RoleRepository.java
public interface RoleRepository extends JpaRepository<Role, Long> {
=======
public interface RolRepository extends JpaRepository<Role, UUID> {
>>>>>>> Stashed changes:src/main/java/com/hex4w0rd/boarddie/repositories/RolRepository.java
}
