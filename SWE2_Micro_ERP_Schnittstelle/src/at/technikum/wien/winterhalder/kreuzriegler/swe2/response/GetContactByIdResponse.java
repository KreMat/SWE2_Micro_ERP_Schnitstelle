/**
 * 
 */
package at.technikum.wien.winterhalder.kreuzriegler.swe2.response;

import at.technikum.wien.winterhalder.kreuzriegler.swe2.dto.ContactDto;

/**
 * @author richie
 * 
 */
public class GetContactByIdResponse {
	private ContactDto contact;

	/**
	 * @param contact
	 */
	public GetContactByIdResponse(ContactDto contact) {
		this.contact = contact;
	}

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
}
