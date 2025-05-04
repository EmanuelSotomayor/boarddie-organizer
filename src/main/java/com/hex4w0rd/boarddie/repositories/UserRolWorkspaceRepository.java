package com.hex4w0rd.boarddie.repositories;

import com.hex4w0rd.boarddie.entities.UserRolWorkspace;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRolWorkspaceRepository extends JpaRepository<UserRolWorkspace, UUID> {
    List<UserRolWorkspace> findByUserId(UUID userId);
    List<UserRolWorkspace> findByUserEmail(String email);
}