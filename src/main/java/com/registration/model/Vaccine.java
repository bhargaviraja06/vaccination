package com.registration.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Vaccine {
@Id
private String citizenId;
private String citizenName;
private String vaccineName;
private String vaccineCenterId;
private String vaccinationCenterAddress;
public Vaccine() {
	super();
}
public Vaccine(String citizenId, String citizenName, String vaccineName, String vaccineCenterId,
		String vaccinationCenterAddress) {
	super();
	this.citizenId = citizenId;
	this.citizenName = citizenName;
	this.vaccineName = vaccineName;
	this.vaccineCenterId = vaccineCenterId;
	this.vaccinationCenterAddress = vaccinationCenterAddress;
}
public String getCitizenId() {
	return citizenId;
}
public void setCitizenId(String citizenId) {
	this.citizenId = citizenId;
}
public String getCitizenName() {
	return citizenName;
}
public void setCitizenName(String citizenName) {
	this.citizenName = citizenName;
}
public String getVaccineName() {
	return vaccineName;
}
public void setVaccineName(String vaccineName) {
	this.vaccineName = vaccineName;
}
public String getVaccineCenterId() {
	return vaccineCenterId;
}
public void setVaccineCenterId(String vaccineCenterId) {
	this.vaccineCenterId = vaccineCenterId;
}
public String getVaccinationCenterAddress() {
	return vaccinationCenterAddress;
}
public void setVaccinationCenterAddress(String vaccinationCenterAddress) {
	this.vaccinationCenterAddress = vaccinationCenterAddress;
}
@Override
public String toString() {
	return "Vaccine [citizenId=" + citizenId + ", citizenName=" + citizenName + ", vaccineName=" + vaccineName
			+ ", vaccineCenterId=" + vaccineCenterId + ", vaccinationCenterAddress=" + vaccinationCenterAddress
			+ ", getCitizenId()=" + getCitizenId() + ", getCitizenName()=" + getCitizenName() + ", getVaccineName()="
			+ getVaccineName() + ", getVaccineCenterId()=" + getVaccineCenterId() + ", getVaccinationCenterAddress()="
			+ getVaccinationCenterAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

}
