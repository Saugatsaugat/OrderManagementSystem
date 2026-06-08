package com.saugat.oms.dto;

public class UserRoleDto extends EntityChangeTrackerDto{

    private UserDto user;
    private RoleDto role;

    public UserRoleDto() {}

    public UserRoleDto(UserDto user, RoleDto role) {
        this.user = user;
        this.role = role;
    }

    public UserRoleDto(Long id, UserDto user, RoleDto role) {
        super(id);
        this.user = user;
        this.role = role;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public RoleDto getRole() {
        return role;
    }

    public void setRole(RoleDto role) {
        this.role = role;
    }
}
