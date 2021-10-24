package HrmsProje.HrmsProje.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employer_users")
public class Employer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int e_id;

	@Column(name = "company_name")
	private String company_name;
	
	@Column(name = "web_address")
	private String web_address;
	
	@Column(name = "phone_number")
	private String phone_number;

	public Employer() {
		super();
	}

	public Employer(int e_id, String company_name, String web_address, String phone_number) {
		super();
		this.e_id = e_id;
		this.company_name = company_name;
		this.web_address = web_address;
		this.phone_number = phone_number;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}



	public String getWeb_address() {
		return web_address;
	}

	public void setWeb_address(String web_address) {
		this.web_address = web_address;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	
	
	

}
