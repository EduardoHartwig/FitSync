package com.Hartwig.FitSync.dto;

import com.Hartwig.FitSync.model.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
