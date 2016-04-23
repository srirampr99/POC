package com.myfirst.ws;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length != 1)
		{
			System.out.println("You need to pass in 1 IP address");
		}
		else
		{
			String iPAddress = args[0];
			GeoIPService  geoIPService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
			GeoIP geoIP = geoIPServiceSoap.getGeoIP(iPAddress);
			System.out.println(geoIP.getCountryName());
		}
		
		
	}

}
