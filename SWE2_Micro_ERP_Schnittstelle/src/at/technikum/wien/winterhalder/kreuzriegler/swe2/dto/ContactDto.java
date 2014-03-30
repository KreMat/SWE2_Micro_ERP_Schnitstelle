package at.technikum.wien.winterhalder.kreuzriegler.swe2.dto;

import java.util.HashMap;
import java.util.Map;

import at.technikum.wien.winterhalder.kreuzriegler.swe2.enums.AddressType;

public class ContactDto {

	private long id;

	private String companyname;

	private String uid;

	private String title;

	private String firstname;

	private String lastname;

	private String suffix;

	private long birthday;

	private Map<AddressType, AddressDto> addresses = new HashMap<AddressType, AddressDto>();

	private Long companyId;

	/**
	 * @return the companyname
	 */
	public String getCompanyname() {
		return companyname;
	}

	/**
	 * @param companyname
	 *            the companyname to set
	 */
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * @param uid
	 *            the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname
	 *            the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname
	 *            the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the suffix
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * @param suffix
	 *            the suffix to set
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	/**
	 * @return the birthday
	 */
	public Long getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday
	 *            the birthday to set
	 */
	public void setBirthday(long birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the companyId
	 */
	public Long getCompanyId() {
		return companyId;
	}

	/**
	 * @param companyId
	 *            the companyId to set
	 */
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the addresses
	 */
	public Map<AddressType, AddressDto> getAddresses() {
		return addresses;
	}

	/**
	 * @param addresses
	 *            the addresses to set
	 */
	public void setAddresses(Map<AddressType, AddressDto> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (companyname != null)
			sb.append(companyname);
		if (companyname != null)
			sb.append(" ");
		if (uid != null)
			sb.append(uid);
		if (uid != null)
			sb.append(" ");
		if (title != null)
			sb.append(title);
		if (title != null)
			sb.append(" ");
		if (firstname != null)
			sb.append(firstname);
		if (firstname != null)
			sb.append(" ");
		if (lastname != null)
			sb.append(lastname);
		if (lastname != null)
			sb.append(" ");
		if (suffix != null)
			sb.append(suffix);
		if (suffix != null)
			sb.append(" ");
		return sb.toString();
	}

}
