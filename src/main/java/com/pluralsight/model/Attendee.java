package com.pluralsight.model;

import com.pluralsight.view.Phone;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by jingshanyin on 8/17/17.
 */
public class Attendee {

    @Size(min=2, max=30)
    private String name;

    @NotEmpty @Email
    private String emailAddress;

    @NotEmpty @Phone
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
