package com.emplmgt.employee_management.dto;

import lombok.Data;

import java.util.List;

@Data
public class ChangeAssigneeDTO {
    private Long assignee;
    private List<Long> contacts;
}
