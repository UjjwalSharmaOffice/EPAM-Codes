package com.epam.campus;


public class UserValidator {

    /**
     * Validates a user object based on business rules.
     * 
     * Validation rules:
     * - First name must not be null or empty
     * - Last name must not be null or empty
     * - Email must not be null or empty
     * - Password must not be null or empty and must be at least 8 characters long
     * - Role must not be null or empty
     * - User ID must be greater than 0
     *
     * @param user the user to validate
     * @return true if the user is valid, false otherwise
     */
    public boolean isValid(User user) {

        if (user.getFirstName() == null || user.getFirstName().isEmpty()) {
            return false;
        }

        if (user.getLastName() == null || user.getLastName().isEmpty()) {
            return false;
        }

        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            return false;
        }

        if (user.getPassword() == null || user.getPassword().isEmpty() || user.getPassword().length() < 8) {
            return false;
        }

        if (user.getRole() == null || user.getRole().isEmpty()) {
            return false;
        }

        if (user.getId() <= 0) {
            return false;
        }

        return true;
    }
}
