package com.example.demo.dto;

import java.util.List;

public class DepartmentDto {
    private Integer idDepartment;
    private String department;
    private List<String> municipalities;

    public DepartmentDto() {
    }

    public List<String> getMunicipalities() {
        return municipalities;
    }

    public void setMunicipalities(List<String> municipalities) {
        this.municipalities = municipalities;
    }

    public Integer getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(Integer idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "DepartmentDto{" +
                "idDepartment=" + idDepartment +
                ", department='" + department + '\'' +
                ", municipalities=" + municipalities.toString() +
                '}';
    }
}
