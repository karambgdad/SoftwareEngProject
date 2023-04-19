package interfaces;

import datatypes.AddressData;

/**
 * Interface that provides all methods for the interaction with the staffmember.
 * 
 * @author karam
 *
 */
public interface SMCmds {

	public void insertOffer(String startTime, String endTime, AddressData addressData, String capacity, String fee);

}
