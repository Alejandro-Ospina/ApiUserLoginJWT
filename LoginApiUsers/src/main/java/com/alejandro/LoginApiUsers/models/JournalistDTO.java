package com.alejandro.LoginApiUsers.models;

import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JournalistDTO extends UserDTO{
    private List<NewDTO> newDTOList;
    private Long salary;
}