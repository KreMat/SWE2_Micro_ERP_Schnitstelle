package at.technikum.wien.winterhalder.kreuzriegler.swe2.request;

import java.util.ArrayList;
import java.util.List;

import at.technikum.wien.winterhalder.kreuzriegler.swe2.dto.AddressDto;
import at.technikum.wien.winterhalder.kreuzriegler.swe2.dto.ContactDto;

public class CreateOrUpdateContactRequest {

	private ContactDto contact;
	
	/**
	 * @param contact
	 */
	public CreateOrUpdateContactRequest(ContactDto contact) {
		this.contact = contact;
	}
	/**
	 * @return the contact
	 */
	public ContactDto getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(ContactDto contact) {
		this.contact = contact;
	}
}
