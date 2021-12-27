package com.bookmyaction.tickettakie.modal;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@MappedSuperclass
@Data
public abstract class BaseCommonModal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@JsonProperty("id")
	protected Long id;
	
	@Version
	@Column(name="version")
	protected int version;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss", timezone = "IST")
	@JsonProperty("created_date")
	protected Timestamp createdDate;
	
	
	@JsonProperty("web_ref_id")
	protected String webRefID;

	protected Long getId() {
		return id;
	}

	protected void setId(Long id) {
		this.id = id;
	}

	protected int getVersion() {
		return version;
	}

	protected void setVersion(int version) {
		this.version = version;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public String getWebRefID() {
		return webRefID;
	}

	// https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
		@Override
		public int hashCode() {
			final int prime = 37;
			return prime;
		}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseCommonModal other = (BaseCommonModal) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (version != other.version)
			return false;
		if (webRefID == null) {
			if (other.webRefID != null)
				return false;
		} else if (!webRefID.equals(other.webRefID))
			return false;
		return true;
	}
	
	
	@PrePersist
	public void prePersist() {
		this.version=1;
		this.webRefID = UUID.randomUUID().toString().replaceAll("-", "");
		this.createdDate = new Timestamp(System.currentTimeMillis());
	}
	
}
