/**
 * 
 */
package at.technikum.wien.winterhalder.kreuzriegler.swe2.request;

/**
 * @author richie
 *
 */
public class GetCompanysByNameRequest {
	private String name;

	/**
	 * @param name
	 */
	public GetCompanysByNameRequest(String name) {
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
