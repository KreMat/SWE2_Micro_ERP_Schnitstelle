/**
 * 
 */
package at.technikum.wien.winterhalder.kreuzriegler.swe2.request;

/**
 * @author richie
 * 
 */
public class GetContactsByNameRequest {
	private String name;

	/**
	 * @param name
	 */
	public GetContactsByNameRequest(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
