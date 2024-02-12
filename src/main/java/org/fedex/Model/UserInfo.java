package org.fedex.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInfo {
    @JsonProperty("EmployeeId")
    private String EmployeeId;
    @JsonProperty("Name")
    private String Name;
    @JsonProperty("Email")
    private String Email;
    @JsonProperty("Role")
    private String Role;
    @JsonProperty("IsAdmin")
    private String IsAdmin;
    @JsonProperty("ManagerID")
    private String ManagerID;
    @JsonProperty("enabled")
    private boolean enabled;

    public UserInfo() {
    }

    public UserInfo(String employeeId, String name, String email, String role, String isAdmin, String managerID, boolean enabled) {
        EmployeeId = employeeId;
        Name = name;
        Email = email;
        Role = role;
        IsAdmin = isAdmin;
        ManagerID = managerID;
        this.enabled = enabled;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getRole() {
        return Role;
    }

    public String getIsAdmin() {
        return IsAdmin;
    }

    public String getManagerID() {
        return ManagerID;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
