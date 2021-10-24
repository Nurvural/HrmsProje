package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cv {
	@Id
	@Column
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	@Column
	private String mezuniyettarihi;
	@Column
	private String iştecrübe;
	@Column
	private String yabancıdil;
	@Column
	private String  githupadres;
	@Column
	private String linkedinadres;
	@Column
	private String progdili;
	@Column
	private String teknoloji;
	@Column
	private String önyazı;
	public Cv() {
		super();
	}
	public Cv(int id, String mezuniyettarihi, String iştecrübe, String yabancıdil, String githupadres,
			String linkedinadres, String progdili, String teknoloji, String önyazı) {
		super();
		this.id = id;
		this.mezuniyettarihi = mezuniyettarihi;
		this.iştecrübe = iştecrübe;
		this.yabancıdil = yabancıdil;
		this.githupadres = githupadres;
		this.linkedinadres = linkedinadres;
		this.progdili = progdili;
		this.teknoloji = teknoloji;
		this.önyazı = önyazı;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMezuniyettarihi() {
		return mezuniyettarihi;
	}
	public void setMezuniyettarihi(String mezuniyettarihi) {
		this.mezuniyettarihi = mezuniyettarihi;
	}
	public String getIştecrübe() {
		return iştecrübe;
	}
	public void setIştecrübe(String iştecrübe) {
		this.iştecrübe = iştecrübe;
	}
	public String getYabancıdil() {
		return yabancıdil;
	}
	public void setYabancıdil(String yabancıdil) {
		this.yabancıdil = yabancıdil;
	}
	public String getGithupadres() {
		return githupadres;
	}
	public void setGithupadres(String githupadres) {
		this.githupadres = githupadres;
	}
	public String getLinkedinadres() {
		return linkedinadres;
	}
	public void setLinkedinadres(String linkedinadres) {
		this.linkedinadres = linkedinadres;
	}
	public String getProgdili() {
		return progdili;
	}
	public void setProgdili(String progdili) {
		this.progdili = progdili;
	}
	public String getTeknoloji() {
		return teknoloji;
	}
	public void setTeknoloji(String teknoloji) {
		this.teknoloji = teknoloji;
	}
	public String getÖnyazı() {
		return önyazı;
	}
	public void setÖnyazı(String önyazı) {
		this.önyazı = önyazı;
	}
	
	
	

}
