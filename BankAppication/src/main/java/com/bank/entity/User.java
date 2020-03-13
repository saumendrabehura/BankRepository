package com.bank.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.bank.security.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "userId", nullable = false, updatable = false)
	    private Long userId;
	    private String username;
	    private String password;
	    private String firstName;
	    private String lastName;

	    @Column(name = "email", nullable = false, unique = true)
	    private String email;
	    private String phone;
	    
	    
	    private boolean enabled=true;
	    @OneToOne
	    private PrimaryAccount primaryAccount;
	    @OneToOne
	    private SavingsAccount savingAccount;
	    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	    @JsonIgnore
	    private List <Appointment> appointmentlist;
	    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	    private List<RecipientAccount> receiptentList;
	    
	    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	    @JsonIgnore
	    private Set<UserRole> userRoles=new HashSet<>();

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public boolean isEnabled() {
			return enabled;
		}

		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}

		public PrimaryAccount getPrimaryAccount() {
			return primaryAccount;
		}

		public void setPrimaryAccount(PrimaryAccount primaryAccount) {
			this.primaryAccount = primaryAccount;
		}

		public SavingsAccount getSavingAccount() {
			return savingAccount;
		}

		public void setSavingAccount(SavingsAccount savingAccount) {
			this.savingAccount = savingAccount;
		}

		public List<Appointment> getAppointmentlist() {
			return appointmentlist;
		}

		public void setAppointmentlist(List<Appointment> appointmentlist) {
			this.appointmentlist = appointmentlist;
		}

		public List<RecipientAccount> getReceiptentList() {
			return receiptentList;
		}

		public void setReceiptentList(List<RecipientAccount> receiptentList) {
			this.receiptentList = receiptentList;
		}

		public Set<UserRole> getUserRoles() {
			return userRoles;
		}

		public void setUserRoles(Set<UserRole> userRoles) {
			this.userRoles = userRoles;
		}
	    
	    
}
