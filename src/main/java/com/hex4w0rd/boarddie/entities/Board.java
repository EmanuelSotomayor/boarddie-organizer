package com.hex4w0rd.boarddie.entities;

import com.hex4w0rd.boarddie.enums.BoardVisibilityEnum;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "boards")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@SuperBuilder(toBuilder = true)
public class Board extends PersistentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @jakarta.persistence.Column(name = "BOARD_ID")
    private UUID id;
    @jakarta.persistence.Column(name = "TITLE")
    private String title;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
    targetEntity = Workspace.class)
    @JoinColumn(name = "WORKSPACE_ID")
    private Workspace workspace;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
    targetEntity = Column.class)
    @jakarta.persistence.Column(name = "COLUMN_ID")
    private List<Column> columns;
    @Enumerated(EnumType.STRING)
    @jakarta.persistence.Column(name = "VISIBILITY")
    private BoardVisibilityEnum visibility;
    @jakarta.persistence.Column(name = "IS_FAVORITE")
    private Boolean favorite;

}