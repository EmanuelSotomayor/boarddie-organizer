package com.hex4w0rd.boarddie.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hex4w0rd.boarddie.enums.WorkspaceTypeEnum;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "workspaces")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@SuperBuilder(toBuilder = true)
public class Workspace extends PersistentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "WORKSPACE_ID")
    private UUID id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE", nullable = false)
    private WorkspaceTypeEnum type;

    @OneToMany(mappedBy = "workspace", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<UserRolWorkspace> userRolWorkspaces;

}