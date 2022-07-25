package com.qa.Util;

import java.time.LocalDateTime;

public class TC_TestUtil {
	
	public static long PAGE_LOAD_TIMEOUT = 50;
	public static long IMPLICIT_WAIT = 50;
	
	// General
	public static String OS = System.getProperty("os.name").toLowerCase();


	// To detect which OS is running
		public static boolean isWindows() {
			return OS.contains("win");
		}

		public static boolean isMac() {
			return OS.contains("mac");
		}

		public static boolean isUnix() {
			return (OS.contains("nix") || OS.contains("nux") || OS.contains("aix"));
		}

		public static boolean isSolaris() {
			return OS.contains("sunos");
		}

		public static String getProjectDirectory() {
			String projectRootPath = System.getProperty("user.dir");
			return projectRootPath;
		}
		
		 public static String[] getTimeValue() 
	        {
	               

	                LocalDateTime now = LocalDateTime.now();
	   
	        String currentDay = String.valueOf(now.getDayOfMonth());
	                        
	        
	                return new String[] {currentDay};
	        }

	        public static void main(String[] args) {
	                getTimeValue();
	                System.out.println(getTimeValue()[0]);
	               
	        }

}
