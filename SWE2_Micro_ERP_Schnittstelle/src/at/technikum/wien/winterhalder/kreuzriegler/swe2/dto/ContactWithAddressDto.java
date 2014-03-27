/**
 * 
 */
package at.technikum.wien.winterhalder.kreuzriegler.swe2.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Matthias
 * 
 */
public class ContactWithAddressDto {

	private ContactDto contact;

	private List<AddressDto> addresses = new ArrayList<AddressDto>();

	/**
	 * @return the contact
	 */
	public ContactDto getContact() {
		return contact;
	}

	/**
	 * @param contact
	 *            the contact to set
	 */
	public void setContact(ContactDto contact) {
		this.contact = contact;
	}

	/**
	 * @return the addresses
	 */
	public List<AddressDto> getAddresses() {
		return addresses;
	}

	/**
	 * @param addresses
	 *            the addresses to set
	 */
	public void setAddresses(List<AddressDto> addresses) {
		this.addresses = addresses;
	}

}
