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
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Builder
public class Card implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @jakarta.persistence.Column(name = "ID")
    private Long id;
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
    @jakarta.persistence.Column(name = "CREATED_AT", nullable = false)
    private LocalDate createdAt;
    @jakarta.persistence.Column(name = "START_AT")
    private LocalDate startAt;
    @jakarta.persistence.Column(name = "END_AT")
    private LocalDate endAt;
    @jakarta.persistence.Column(name = "USER_ID_CREATOR")
    private Long userIdCreator;
    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private List<User> members;


    @PrePersist
    private void init(){
        this.createdAt = LocalDate.now();
    }

}