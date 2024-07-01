package com.hex4w0rd.boarddie.repositories;

import com.hex4w0rd.boarddie.entities.UserRolWorkspace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRolWorkspaceRepository extends JpaRepository<UserRolWorkspace, Long> {
    public List<UserRolWorkspace> findByUserId(Long userId);
    public List<UserRolWorkspace> findByUserEmail(String email);
}