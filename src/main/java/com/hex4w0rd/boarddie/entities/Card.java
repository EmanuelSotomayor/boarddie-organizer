package com.hex4w0rd.boarddie.entities;

import com.hex4w0rd.boarddie.enums.CardStatusEnum;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@SuperBuilder(toBuilder = true)
public class Card extends PersistentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @jakarta.persistence.Column(name = "CARD_ID")
    private UUID id;
    @jakarta.persistence.Column(name = "TITLE", nullable = false)
    private String title;
    @jakarta.persistence.Column(name = "DESCRIPTION", nullable = false)
    private String description;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
            targetEntity = Column.class)
    @JoinColumn(name = "BOARD_COLUMN_ID")
    private Column column;
    @Enumerated(EnumType.STRING)
    @jakarta.persistence.Column(name = "STATUS")
    private CardStatusEnum status;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,
    targetEntity = Tag.class)
    @JoinTable(name = "CARD_TAGS", joinColumns = {
            @JoinColumn(name = "CARD_ID", nullable = false)
    }, inverseJoinColumns = {
            @JoinColumn(name = "TAG_ID", nullable = false)
    })
    private Set<Tag> tags;
    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private List<User> members;

}