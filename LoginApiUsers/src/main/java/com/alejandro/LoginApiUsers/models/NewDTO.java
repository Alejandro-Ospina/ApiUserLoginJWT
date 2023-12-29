package com.alejandro.LoginApiUsers.models;

import java.time.LocalDate;

public record NewDTO (String newTitle, String newBody,
                      LocalDate creationDate, JournalistDTO journalistDTO){
}
