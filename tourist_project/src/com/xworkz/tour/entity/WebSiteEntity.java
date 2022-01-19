package com.xworkz.tour.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "websitetable")
@NamedQueries({
		@NamedQuery(name = "getByNameGoogle", query = "select web from WebSiteEntity web where web.name = 'google'"),
		@NamedQuery(name = "getbyurl", query = "select web from WebSiteEntity web where web.url like 'www.d%'"),
		@NamedQuery(name=  "getByMaxSince", query="select web from WebSiteEntity web where web.since= (select max(web.since) from WebSiteEntity web)"),
		@NamedQuery(name=  "getByMinSince", query="select web from WebSiteEntity web where web.since= (select min(web.since) from WebSiteEntity web)"),
		@NamedQuery(name=  "getbySecondMinSince",query="select web from WebSiteEntity web where web.since =(select min(web.since) from WebSiteEntity web where web.since > (select min(web.since) from WebSiteEntity web))"),
		@NamedQuery(name = "getbySecondMaxSince",query="select web from WebSiteEntity web where web.since =(select max(web.since) from WebSiteEntity web where web.since < (select max(web.since) from WebSiteEntity web))")

//select*from song_details where s_likes =(select max(s_likes)
		//from song_details where s_likes < (select max(s_likes) from song_details));
})//
public class WebSiteEntity {
	@Id
	@Column(name = "w_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "w_name")
	private String name;
	@Column(name = "w_domain")
	private String domain;
	@Column(name = "w_owner")
	private String owner;
	@Column(name = "w_since")
	private int since;
	@Column(name = "w_url")
	private String url;

	public WebSiteEntity() {
		// TODO Auto-generated constructor stub
	}

	public WebSiteEntity(String name, String domain, String owner, int since, String url) {
		super();

		this.name = name;
		this.domain = domain;
		this.owner = owner;
		this.since = since;
		this.url = url;
	}

	@Override
	public String toString() {
		return "WebSiteEntity [id=" + id + ", name=" + name + ", domain=" + domain + ", owner=" + owner + ", since="
				+ since + ", url=" + url + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WebSiteEntity other = (WebSiteEntity) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
