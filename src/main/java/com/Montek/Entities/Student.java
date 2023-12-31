package com.Montek.Entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="Student_portal")
public class Student {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotBlank(message = "First name is required")
	    @Column(name = "first_name", nullable = false, length = 40)
	    private String firstname;

	    @NotBlank(message = "Last name is required")
	    @Column(name = "last_name", nullable = false, length = 40)
	    private String lastname;

	    @NotBlank(message = "Email is required")
	    @Email(message = "Invalid email format")
	    @Column(nullable = false, length = 128, unique = true)
	    private String email;

	    @Past(message = "Date of birth must be in the past")
	    private Date dob;

	    @Pattern(regexp = "[0-9]{10}", message = "Mobile number must be 10 digits")
	    private String mobile;

	    @NotBlank(message = "Gender is required")
	    private String gender;

	    @NotBlank(message = "Qualification is required")
	    private String qualification;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
	

}
