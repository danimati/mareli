package com.mareli.mareli.bdconfig.Entitys;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "useryroles")
public class UseryrolEntity {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "userid")
    private UUID userId;

    @Column(name = "roleid")
    private UUID roleId;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getRoleId() {
        return roleId;
    }

    public void setRoleId(UUID roleId) {
        this.roleId = roleId;
    }


}
