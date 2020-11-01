package com.registration.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.Table;
import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.springframework.lang.NonNull;




@Entity
public class Registration
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
    @NotNull(message = "NAME MUST NOT BE EMPTY")
    @Length(min = 2, max = 20)
	private String first_name;
    @NotNull
    @Length(min = 2, max = 20)
	private String second_name;
    @NotNull
	private String adress_1;
    @NotNull
	private String adress_2;
    @NotNull
	private String city;
    @NotNull
	private String state;
    @NotNull
	private String pincode;
    @NotNull
	public String proffesion;
	@NotNull
	@Email(message = "Email should be valid")
	private String email;
	@NotNull(message = "invalid number")
	@Size(min = 0,max=10)
	public String mobilenumber;
	@NotNull
	public Date date;
	
	
	public Boolean promotion;

	public Boolean policies;
	
	public String refralCode;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getSecond_name() {
		return second_name;
	}

	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}

	public String getAdress_1() {
		return adress_1;
	}

	public void setAdress_1(String adress_1) {
		this.adress_1 = adress_1;
	}

	public String getAdress_2() {
		return adress_2;
	}

	public void setAdress_2(String adress_2) {
		this.adress_2 = adress_2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getProffesion() {
		return proffesion;
	}

	public void setProffesion(String proffesion) {
		this.proffesion = proffesion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getPromotion() {
		return promotion;
	}

	public void setPromotion(Boolean promotion) {
		this.promotion = promotion;
	}

	public Boolean getPolicies() {
		return policies;
	}

	public void setPolicies(Boolean policies) {
		this.policies = policies;
	}

	public String getRefralCode() {
		return refralCode;
	}

	public void setRefralCode(String refralCode) {
		this.refralCode = refralCode;
	}

	@Override
	public String toString() {
		return "Registration [id=" + id + ", first_name=" + first_name + ", second_name=" + second_name + ", adress_1="
				+ adress_1 + ", adress_2=" + adress_2 + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ ", proffesion=" + proffesion + ", email=" + email + ", mobilenumber=" + mobilenumber + ", date="
				+ date + ", promotion=" + promotion + ", policies=" + policies + ", refralCode=" + refralCode + "]";
	}

	public Registration(int id,
			@NotNull(message = "NAME MUST NOT BE EMPTY") @Length(min = 2, max = 20) String first_name,
			@NotNull @Length(min = 2, max = 20) String second_name, @NotNull String adress_1, @NotNull String adress_2,
			@NotNull String city, @NotNull String state, @NotNull String pincode, @NotNull String proffesion,
			@NotNull @Email(message = "Email should be valid") String email,
			@NotNull(message = "invalid number") @Size(min = 0, max = 10) String mobilenumber, @NotNull Date date,
			Boolean promotion, Boolean policies, String refralCode) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.second_name = second_name;
		this.adress_1 = adress_1;
		this.adress_2 = adress_2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.proffesion = proffesion;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.date = date;
		this.promotion = promotion;
		this.policies = policies;
		this.refralCode = refralCode;
	}

	public Registration() {
		super();
	}

	
	
	
	

}
