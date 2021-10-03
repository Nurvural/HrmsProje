package HrmsProje.HrmsProje.entities.concretes;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDate;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_adverts")
public class JobAdvert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

   

    @Column(name = "position_id")
    private String position;

    @Column(name = "city_id")
    private String city;

    
    @Column(name = "working_place")
    private String workingPlace;


    @Column(name = "working_time")
    private String workingTime;

   
    @Column(name = "advert_description")
    private String advertDescription;

    @Column(name = "min_salary")
    private int minSalary;

    @Column(name = "max_salary")
    private int maxSalary;

  
    @Column(name = "open_position")
    private short openPosition;

    @Column(name = "deadline")
    private String deadline;

   
    @Column(name = "created_date")
    private String createdDate;



	public JobAdvert() {
		super();
	}

	public JobAdvert(int id,  String position, String city, String workingPlace, String workingTime,
			String advertDescription, int minSalary, int maxSalary, short openPosition, String deadline,
			String createdDate) {
		super();
		this.id = id;
	
		this.position = position;
		this.city = city;
		this.workingPlace = workingPlace;
		this.workingTime = workingTime;
		this.advertDescription = advertDescription;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.openPosition = openPosition;
		this.deadline = deadline;
		this.createdDate = createdDate;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getWorkingPlace() {
		return workingPlace;
	}

	public void setWorkingPlace(String workingPlace) {
		this.workingPlace = workingPlace;
	}

	public String getWorkingTime() {
		return workingTime;
	}

	public void setWorkingTime(String workingTime) {
		this.workingTime = workingTime;
	}

	public String getAdvertDescription() {
		return advertDescription;
	}

	public void setAdvertDescription(String advertDescription) {
		this.advertDescription = advertDescription;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}

	public short getOpenPosition() {
		return openPosition;
	}

	public void setOpenPosition(short openPosition) {
		this.openPosition = openPosition;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}



}
	
