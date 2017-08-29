package com.InterestDecisionEngine.model.domain;

import java.io.Serializable;


/**
 * Subscriber Info (SubscrInfo) class which stores user entered specific information
 * Subscriber Info is received from consumer input or from MVPD
 * @author JasonCanney
 *
 */

	public class SubscrInfo implements Serializable
	{

		/** Exception class stub */
		public class InvalidReleaseException {

	}

		/**
		 * @param serialVersionUID
		 * The serialVersionUID is a universal version identifier for a Serializable class. Deserialization uses this
		 *  number to ensure that a loaded class corresponds exactly to a serialized object. If no match is found,
		 *  then an InvalidClassException is thrown
		 */
		
		private static final long serialVersionUID = 1L;

		private static final int ID = 0;

			/** Release Name Application is associated with */
			private String subLoginID;	
	
			/** Release Number Application is associated with */
			private String subLoginPWD;
		  
			/** Type of release that application is associated with */
			private String subFirstName;
                        
                        /** Type of release that application is associated with */
			private String subLastName;
                        
                        /** Type of release that application is associated with */
			private String subAddress;
                        
                        /** Type of release that application is associated with */
			private String subCity;
                        
                        /** Type of release that application is associated with */
			private String subState;
                        
                        /** Type of release that application is associated with */
			private String subZip;
                        
		/**
		 * Copy Constructor
		 *
		 * @param subscrinfo a <code>SubscrInfo</code> object
		 */
		public SubscrInfo(SubscrInfo subscrinfo) 
		{
		    this.subLoginID = subscrinfo.subLoginID;
                    this.subLoginPWD = subscrinfo.subLoginPWD;
		    this.subFirstName = subscrinfo.subFirstName;
                    this.subLastName = subscrinfo.subLastName;
		    this.subAddress = subscrinfo.subAddress;
		    this.subCity = subscrinfo.subCity;
		    this.subState = subscrinfo.subState;
                    this.subZip = subscrinfo.subZip;
		}

		/**
		 * @param subLoginID
		 * @param subLoginPWD
		 * @param subFirstName
		 * @param subLastName
                 * @param subAddress
                 * @param subCity
                 * @param subState
                 * @param subZip
		 */
		public SubscrInfo(String subLoginID, String subLoginPWD, String subFirstName, String subLastName, String subAddress, String subCity, String subState, String subZip)
		{
			this.subLoginID = subLoginID;
			this.subLoginPWD = subLoginPWD;
			this.subFirstName = subFirstName;
                        this.subLastName = subLastName;
                        this.subAddress = subAddress;
                        this.subCity = subCity;
                        this.subState = subState;
                        this.subZip = subZip;
		}
	
	
		  
			public SubscrInfo() {
			// Auto-generated constructor stub
		}

			/**
			 * @return the subLoginID
			 */
			public String getSubLoginID() {
				return subLoginID;
			}

			/**
			 * @param subLoginID the subLoginID to set
			 */
			public void setSubLoginID(String subLoginID) {
				this.subLoginID = subLoginID;
			}
				
                        /**
			 * @return the subLoginPWD
			 */
			public String getSubLoginPWD() {
				return subLoginPWD;
			}

			/**
			 * @param subLoginPWD the subLoginPWD to set
			 */
			public void setSubLoginPWD(String subLoginPWD) {
				this.subLoginPWD = subLoginPWD;
			}
                        
                        /**
			 * @return the subFirstName
			 */
			public String getSubFirstName() {
				return subFirstName;
			}

			/**
			 * @param subFirstName the subFirstName to set
			 */
			public void setSubFirstName(String subFirstName) {
				this.subFirstName = subFirstName;
			}
                        
                       /**
			 * @return the subLastName
			 */
			public String getSubLastName() {
				return subLastName;
			}

			/**
			 * @param subLastName the subLastName to set
			 */
			public void setSubLastName(String subLastName) {
				this.subLastName = subLastName;
			} 
                        
                        /**
			 * @return the subAddress
			 */
			public String getSubAddress() {
				return subAddress;
			}

			/**
			 * @param subAddress the subAddress to set
			 */
			public void setSubAddress(String subAddress) {
				this.subAddress = subAddress;
			} 
                        
                        /**
			 * @return the subCity
			 */
			public String getSubCity() {
				return subCity;
			}

			/**
			 * @param subCity the subCity to set
			 */
			public void setSubCity(String subCity) {
				this.subCity = subCity;
			} 
                        
                        /**
			 * @return the subState
			 */
			public String getSubState() {
				return subState;
			}

			/**
			 * @param subState the subState to set
			 */
			public void setSubState(String subState) {
				this.subState = subState;
			} 
                        
                        /**
			 * @return the subZip
			 */
			public String getSubZip() {
				return subZip;
			}

			/**
			 * @param subZip the subZip to set
			 */
			public void setSubZip(String subZip) {
				this.subZip = subZip;
			} 
                       
			/**
			 * 
			 * @return boolean true/false
			 */
			public boolean validate () 
			{
                                if (subLoginID == null) return false;
                                if (subLoginPWD == null) return false;
                                if (subFirstName == null) return false;
                                if (subLastName == null) return false;
                                if (subAddress == null) return false;
                                if (subCity == null) return false;
                                if (subState == null) return false;
                                if (subZip == null) return false;
			
				return true;
			}

			/**
			 * 
			 * @param subscrinfo
			 * @return boolean true/false
			 */
			public boolean equals(SubscrInfo subscrinfo) 
			{
				if (subLoginID.equals(subscrinfo.getSubLoginID())) {
                                   } else {
                                    return false;
                                    }
				if (subLoginPWD.equals(subscrinfo.getSubLoginPWD())) {
                                    } else {
                                    return false;
                                    }
				if (subFirstName.equals(subscrinfo.getSubFirstName())) {
                                    } else {
                                    return false;
                                    }
                                if (subLastName.equals(subscrinfo.getSubLastName())) {
                                    } else {
                                    return false;
                                    }
				return true;
			}

			/**
			 * Constructs a <code>String</code> with all attributes
			 * in name = value format.
			 *
			 * @return a <code>String</code> representation 
			 * of this object.
			 */
                        
                        @Override
			public String toString()
			{
			    final String TAB = "    ";
			    
			    String retValue = "";
			    
			    retValue = "SubscrInfo ( "
			        + super.toString() + TAB
			        + "subLoginID = " + this.subLoginID + TAB
			        + "subLoginPWD = " + this.subLoginPWD + TAB
			        + "subFirstName = " + this.subFirstName + TAB
                                + "subLastName = " + this.subLastName + TAB
                                + "subAddress = " + this.subAddress + TAB
                                + "subCity = " + this.subCity + TAB
                                + "subState = " + this.subState + TAB
                                + "subZip = " + this.subZip + TAB
			        + " )";
			
			    return retValue;
			}

			/** 
			 * @param obj The object being compared
			 * @return true if the objects are the same; since IDs should always be unique, no two Releases should ever be equal
			 */
			@Override
			public boolean equals(Object obj) {
				return (this == obj);
			}
			
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ID;
				return result;
			}
			
			
			
	}	// end of Release class
