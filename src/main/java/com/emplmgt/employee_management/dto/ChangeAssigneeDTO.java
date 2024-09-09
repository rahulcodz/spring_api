package com.emplmgt.employee_management.dto;

import com.emplmgt.employee_management.enums.Status;
import lombok.Data;

import java.util.List;

@Data
public class ChangeAssigneeDTO {
    private Long assignee;
    private List<Long> contacts;
    private Status status;
    private Boolean qualified;
}
