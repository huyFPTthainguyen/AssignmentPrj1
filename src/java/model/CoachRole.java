/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class CoachRole {

    private int roleId;
    private String roleName;

    public CoachRole() {
    }

    public CoachRole(int roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }
    

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "CoachRole{" + "roleId=" + roleId + ", roleName=" + roleName + '}';
    }

}
