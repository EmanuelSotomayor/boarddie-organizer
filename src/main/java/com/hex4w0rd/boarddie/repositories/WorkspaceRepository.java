package com.hex4w0rd.boarddie.repositories;

import com.hex4w0rd.boarddie.entities.Workspace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkspaceRepository extends JpaRepository<Workspace, Long> {
    @Query(value = "SELECT work FROM Workspace work INNER JOIN UserRolWorkspace uwork ON uwork.workspace.id = work.id WHERE uwork.user.id = :userId", nativeQuery = false)
    public List<Workspace> findAllWorkspacesByUserId(@Param(value = "userId") Long userId);
}
