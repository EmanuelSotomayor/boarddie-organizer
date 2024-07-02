package com.hex4w0rd.boarddie.repositories;

import com.hex4w0rd.boarddie.entities.Column;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColumnRepository extends JpaRepository<Column, Long> {
}
