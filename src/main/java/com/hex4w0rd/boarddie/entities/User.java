package com.hex4w0rd.boarddie.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@SuperBuilder(toBuilder = true)
public class User extends PersistentEntity implements UserDetails, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "USER_ID")
    private UUID id;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @OneToOne
    private Image profileImage;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "PERSON_ID")
    private Person person;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<UserRolWorkspace> userRolWorkspaces;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.userRolWorkspaces.stream()
                .map(UserRolWorkspace::getRole)
                .map(role -> new SimpleGrantedAuthority("ROLE_" + role.getCode()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}