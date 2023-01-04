package org.library.backend.util.constants;

public enum PersonRole {
    ROLE_USER("ROLE_USER"),
    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_SUBSCRIBED("ROLE_SUBSCRIBED"),
    ROLE_RESTRICTED("ROLE_RESTRICTED"),
    ROLE_BANNED("ROLE_BANNED");

    PersonRole(String roleUser) {
    }
}
