package com.example.spring_mvc.model;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class User {

    @NotNull(message = "ID cannot be null")
    private Long id;

    public @NotNull(message = "ID cannot be null") Long getId() {
        return id;
    }

    public void setId(@NotNull(message = "ID cannot be null") Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Username cannot be blank") String getUsername() {
        return username;
    }

    public void setUsername(@NotBlank(message = "Username cannot be blank") String username) {
        this.username = username;
    }

    public @Size(min = 2, max = 30, message = "First name must be between 2 and 30 characters") String getFirstName() {
        return firstName;
    }

    public void setFirstName(@Size(min = 2, max = 30, message = "First name must be between 2 and 30 characters") String firstName) {
        this.firstName = firstName;
    }

    public @NotEmpty(message = "Last name cannot be empty") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotEmpty(message = "Last name cannot be empty") String lastName) {
        this.lastName = lastName;
    }

    public @Email(message = "Email should be valid") String getEmail() {
        return email;
    }

    public void setEmail(@Email(message = "Email should be valid") String email) {
        this.email = email;
    }

    public @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Phone number is invalid") String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(@Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Phone number is invalid") String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public @Past(message = "Date of birth must be a past date") LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(@Past(message = "Date of birth must be a past date") LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public @PastOrPresent(message = "Last login must be a past or present date") LocalDate getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(@PastOrPresent(message = "Last login must be a past or present date") LocalDate lastLogin) {
        this.lastLogin = lastLogin;
    }

    public @Future(message = "Subscription end date must be a future date") LocalDate getSubscriptionEndDate() {
        return subscriptionEndDate;
    }

    public void setSubscriptionEndDate(@Future(message = "Subscription end date must be a future date") LocalDate subscriptionEndDate) {
        this.subscriptionEndDate = subscriptionEndDate;
    }

    public @FutureOrPresent(message = "Creation date must be a present or future date") LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(@FutureOrPresent(message = "Creation date must be a present or future date") LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @AssertTrue(message = "Must be an active user")
    public boolean isActive() {
        return isActive;
    }

    public void setActive(@AssertTrue(message = "Must be an active user") boolean active) {
        isActive = active;
    }

    @AssertFalse(message = "Cannot be a deleted user")
    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(@AssertFalse(message = "Cannot be a deleted user") boolean deleted) {
        isDeleted = deleted;
    }

    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 100, message = "Age should not be more than 100")
    public int getAge() {
        return age;
    }

    public void setAge(@Min(value = 18, message = "Age should not be less than 18") @Max(value = 100, message = "Age should not be more than 100") int age) {
        this.age = age;
    }

    public @Positive(message = "Rank must be a positive number") Integer getRank() {
        return rank;
    }

    public void setRank(@Positive(message = "Rank must be a positive number") Integer rank) {
        this.rank = rank;
    }

    public @PositiveOrZero(message = "Balance must be a positive number or zero") BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(@PositiveOrZero(message = "Balance must be a positive number or zero") BigDecimal balance) {
        this.balance = balance;
    }

    public @Negative(message = "Debt must be a negative number") BigDecimal getDebt() {
        return debt;
    }

    public void setDebt(@Negative(message = "Debt must be a negative number") BigDecimal debt) {
        this.debt = debt;
    }

    public @NegativeOrZero(message = "Negative balance must be zero or negative") BigDecimal getNegativeBalance() {
        return negativeBalance;
    }

    public void setNegativeBalance(@NegativeOrZero(message = "Negative balance must be zero or negative") BigDecimal negativeBalance) {
        this.negativeBalance = negativeBalance;
    }

    public @Digits(integer = 3, fraction = 2, message = "Height must be a number with up to 3 integers and 2 decimal places") BigDecimal getHeight() {
        return height;
    }

    public void setHeight(@Digits(integer = 3, fraction = 2, message = "Height must be a number with up to 3 integers and 2 decimal places") BigDecimal height) {
        this.height = height;
    }

    public @DecimalMin(value = "0.0", inclusive = false, message = "Salary must be greater than 0.0") BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(@DecimalMin(value = "0.0", inclusive = false, message = "Salary must be greater than 0.0") BigDecimal salary) {
        this.salary = salary;
    }

    public @DecimalMax(value = "1000000.0", inclusive = true, message = "Net worth must be lower than or equal to 1,000,000.0") BigDecimal getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(@DecimalMax(value = "1000000.0", inclusive = true, message = "Net worth must be lower than or equal to 1,000,000.0") BigDecimal netWorth) {
        this.netWorth = netWorth;
    }

    @NotBlank(message = "Username cannot be blank")
    private String username;

    @Size(min = 2, max = 30, message = "First name must be between 2 and 30 characters")
    private String firstName;

    @NotEmpty(message = "Last name cannot be empty")
    private String lastName;

    @Email(message = "Email should be valid")
    private String email;

    @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Phone number is invalid")
    private String phoneNumber;

    @Past(message = "Date of birth must be a past date")
    private LocalDate dateOfBirth;

    @PastOrPresent(message = "Last login must be a past or present date")
    private LocalDate lastLogin;

    @Future(message = "Subscription end date must be a future date")
    private LocalDate subscriptionEndDate;

    @FutureOrPresent(message = "Creation date must be a present or future date")
    private LocalDate creationDate;

    @AssertTrue(message = "Must be an active user")
    private boolean isActive;

    @AssertFalse(message = "Cannot be a deleted user")
    private boolean isDeleted;

    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 100, message = "Age should not be more than 100")
    private int age;

    @Positive(message = "Rank must be a positive number")
    private Integer rank;

    @PositiveOrZero(message = "Balance must be a positive number or zero")
    private BigDecimal balance;

    @Negative(message = "Debt must be a negative number")
    private BigDecimal debt;

    @NegativeOrZero(message = "Negative balance must be zero or negative")
    private BigDecimal negativeBalance;

    @Digits(integer = 3, fraction = 2, message = "Height must be a number with up to 3 integers and 2 decimal places")
    private BigDecimal height;

    @DecimalMin(value = "0.0", inclusive = false, message = "Salary must be greater than 0.0")
    private BigDecimal salary;

    @DecimalMax(value = "1000000.0", inclusive = true, message = "Net worth must be lower than or equal to 1,000,000.0")
    private BigDecimal netWorth;

    // Getters and Setters omitted for brevity
}