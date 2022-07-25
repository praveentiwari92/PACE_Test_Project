package com.sendemail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.TimeZone;

public class Utill {

	static String elementCookieXpath = "//*[@id='ss_cookie_consent_msg']";
	static String elementCookieClose = "cookieclose";

	// Time Zone dependent to getLocalDateTime
	public static String getLocalDateTime() {
		Date date = new Date();
		System.out.println("Default Server Date Time: " + date.toString());
		String format = "MMM dd yyyy hh:mm:ss a";
		String timeZone = "IST"; // PST // GMT // IST // UTC
		// create SimpleDateFormat object with input format
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		// set timezone to SimpleDateFormat
		sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
		String ldtString = sdf.format(date);
		System.out.println("Local Date Time in " + timeZone + " : " + ldtString);
		return ldtString;
	}

	/*
	 * To get current Date time
	 */
	public static java.util.Date getDateTime() {
		java.util.Date scriptDate = new java.util.Date();
		return scriptDate;
	}

	/*
	 * Time Zone dependent to getLocalDate
	 */
	public static String getLocalDate(String format) {
		Date date = new Date();

		String timeZone = "IST"; // PST // GMT // IST // UTC
		
		// create SimpleDateFormat object with input format
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		// set timezone to SimpleDateFormat
		sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
		String ldtString = sdf.format(date);
		return ldtString;
	}

	/*
	 * Time Zone dependent to getDOB
	 */
	public static String getDOB(String strDate) {
		Date date = new Date();
		String ldtString = "";
//		  	System.out.println("Default Server Date Time: "+ date.toString());
		String format = "dd-MMM-yyyy";
		String timeZone = "IST"; // PST // GMT // IST // UTC
		// create SimpleDateFormat object with input format
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		// set timezone to SimpleDateFormat
		sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
		try {
			date = sdf.parse(strDate);
			String formatNew = "yyyy-MM-dd";
			SimpleDateFormat sdfnew = new SimpleDateFormat(formatNew);
			ldtString = sdfnew.format(date);
//			 	System.out.println("Local Date Time in " + timeZone +  " : " + ldtString);				
		} catch (ParseException e) {
			e.printStackTrace();
			ldtString = "";
		}
		return ldtString;
	}

	/*
	 * To show home much time takes to process this script
	 */
	public static void showTimeDifference(java.util.Date startDateTime, java.util.Date endDateTime) {

		System.out.println("\nScript Start at: " + startDateTime);
		System.out.println("Script End at: " + endDateTime);

		DecimalFormat crunchifyFormatter = new DecimalFormat("###,###");

		// getTime() returns the number of milliseconds since January 1, 1970, 00:00:00
		// GMT represented by this Date object
		long diff = endDateTime.getTime() - startDateTime.getTime();

		int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
		System.out.println("difference between days: " + diffDays);

		int diffhours = (int) (diff / (60 * 60 * 1000));
		System.out.println("difference between hours: " + crunchifyFormatter.format(diffhours));

		int diffmin = (int) (diff / (60 * 1000));
		System.out.println("difference between minutues: " + crunchifyFormatter.format(diffmin));

		int diffsec = (int) (diff / (1000));
		System.out.println("difference between seconds: " + crunchifyFormatter.format(diffsec));

		System.out.println("difference between milliseconds: " + crunchifyFormatter.format(diff));
	}

	// To detect which OS is running
	public static boolean isWindows() {
		return CONSTANTS.OS.contains("win");
	}

	public static boolean isMac() {
		return CONSTANTS.OS.contains("mac");
	}

	public static boolean isUnix() {
		return (CONSTANTS.OS.contains("nix") || CONSTANTS.OS.contains("nux") || CONSTANTS.OS.contains("aix"));
	}

	public static boolean isSolaris() {
		return CONSTANTS.OS.contains("sunos");
	}

	public static String getProjectDirectory() {
		String projectRootPath = System.getProperty("user.dir");
		return projectRootPath;
	}

	/*
	 * To get home much time takes to process this script in string
	 */
	public static String showTimeDifferenceInString(java.util.Date startDateTime, java.util.Date endDateTime,
			String message) {

		String receiveMsg = "\n" + message;

		String timeDiffStr = "";

		String strStartDate = "\nStart at: " + startDateTime;
		String strEndDate = "\nEnd at: " + endDateTime;

		DecimalFormat crunchifyFormatter = new DecimalFormat("###,###");

		// getTime() returns the number of milliseconds since January 1, 1970, 00:00:00
		// GMT represented by this Date object
		long diff = endDateTime.getTime() - startDateTime.getTime();

		int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
		String strDaysDiff = "\ndifference between days: " + diffDays;

		int diffhours = (int) (diff / (60 * 60 * 1000));
		String strHoursDiff = "\ndifference between hours: " + crunchifyFormatter.format(diffhours);

		int diffmin = (int) (diff / (60 * 1000));
		String strMinuteDiff = "\ndifference between minutues: " + crunchifyFormatter.format(diffmin);

		int diffsec = (int) (diff / (1000));
		String strSecondsDiff = "\ndifference between seconds: " + crunchifyFormatter.format(diffsec);

		String strMiliSecondsDiff = "\ndifference between milliseconds: " + crunchifyFormatter.format(diff);

		timeDiffStr = receiveMsg + strStartDate + strEndDate + strDaysDiff + strHoursDiff + strMinuteDiff
				+ strSecondsDiff + strMiliSecondsDiff;

		return timeDiffStr;
	}

	/**
	 * To check that file exist on given path
	 * 
	 * @param filePath
	 * @return boolean
	 */
	public static boolean isFileExist(String filePath) {
		boolean isFilePresent = false;
		// Get the file
		File file = new File(filePath);

		// Check if the specified file
		// Exists or not
		if (file.exists()) {
			System.out.println("Exists File: " + file.getName());
			isFilePresent = true;
		} else {
			System.out.println("Does not Exists File: " + file.getName());
			isFilePresent = false;
		}
		return isFilePresent;
	}

	/**
	 * To delete file on given path
	 * 
	 * @param filePath
	 */
	public static void deleteFile(String filePath) {
		File file = new File(filePath);
		boolean isFileDeleted = false;
		try {
			isFileDeleted = file.delete();
		} catch (Exception e) {
			isFileDeleted = false;
			e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
		}

		if (isFileDeleted) {
			System.out.println("File deleted successfully: " + file.getName());
		} else {
			System.out.println("Failed to delete the file. Might be deleted already.: " + file.getName());
		}
	}

	public static String randomEmail() {
		// create instance of Random class
		Random rand = new Random();
		// Generate random integers in range 0 to 999
		int rand_int = rand.nextInt(1000);
		String emailId = "deepak.khandal+" + rand_int + "@sarvika.com"; // test1@test.com
		return emailId;
	}

	
	public static String getUserEmail(String params) {
		String email = "deepak.khandal@sarvika.com";
		
		try {
		 	FileReader reader=new FileReader("useremail.properties");  
		 	Properties p=new Properties();  
		    p.load(reader);  
		    email = p.getProperty(params);
		} catch (Exception e) {
			email = "deepak.khandal@sarvika.com";
		}
		return email;
	}
	
	public static String getUserPassword(String params) {
		String pwd = "deepak#123";
		
		try {
		 	FileReader reader=new FileReader("useremail.properties");  
		 	Properties p=new Properties();  
		    p.load(reader);  
		    pwd = p.getProperty(params);
		} catch (Exception e) {
			pwd = "deepak#123";
		}
		return pwd;
	}
	
	public static String getPropertyByKey(String keyParam) {
		String key = "";
		
		try {
		 	FileReader reader=new FileReader("AdminConfig.properties");  
		 	Properties p=new Properties();  
		    p.load(reader);  
		    key = p.getProperty(keyParam);
		} catch (Exception e) {
			key = "";
		}
		return key;
	}
	
	//Pass file path argument
	public static String ReadFile(String incrementCounter) throws IOException { 
		BufferedReader br = new BufferedReader(new FileReader(incrementCounter)); 
		try {
			StringBuilder sb = new StringBuilder(); 
			String line = br.readLine();
	 
			while (line != null){ 
				sb.append(line); 
				sb.append("\n"); 
				line =br.readLine(); 
				//System.out.println(sb.toString()); 
			} 
		return sb.toString();
	 
		} finally { br.close(); } 
	}
	 
	 //Read value from file
	public static String ReadFile() { 
		BufferedReader br=null; 
		StringBuilder sb = new StringBuilder(""); 
		try {
			br = new BufferedReader(new FileReader(".\\incrementCounter")); 
			
			String line = br.readLine();
	 
			while (line != null){ 
				sb.append(line); 
				sb.append("\n"); 
				line =br.readLine(); 
				System.out.println(sb.toString()); 
			} 
		return sb.toString();
	 
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(br!=null) {
				try {
				br.close(); 
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return sb.toString();
	}
	
//	public static JSONObject createJSONObject(String jsonString){
//	    JSONObject  jsonObject=new JSONObject();
//	    JSONParser jsonParser=new  JSONParser();
//	    if ((jsonString != null) && !(jsonString.isEmpty())) {
//	        try {
//	            jsonObject=(JSONObject) jsonParser.parse(jsonString);
//	        } catch (org.json.simple.parser.ParseException e) {
//	            e.printStackTrace();
//	        }
//	    }
//	    return jsonObject;
//	}
	
//	public static JSONObject readJsonFile() {
//		 //JSON parser object to parse read file
//        JSONParser jsonParser = new JSONParser();
//        JSONObject  jsonObjectEditForm=new JSONObject();
//		 try (FileReader reader = new FileReader("resources/Fields_deepform100.json")) // deepform100 is the form name
//	        {
//	            //Read JSON file
//	            Object obj = null;
//				try {
//					obj = jsonParser.parse(reader);
//				} catch (org.json.simple.parser.ParseException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//	 
//	            jsonObjectEditForm = createJSONObject(obj.toString());
//	 
//	        } catch (FileNotFoundException e) {
//	            e.printStackTrace();
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//		 return jsonObjectEditForm;
//	}
//	
	static void modifyFile(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File(filePath);
         
        String oldContent = "";
         
        BufferedReader reader = null;
         
        FileWriter writer = null;
         
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
             
            //Reading all the lines of input text file into oldContent
             
            String line = reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = reader.readLine();
            }
             
            //Replacing oldString with newString in the oldContent
             
            String newContent = oldContent.replaceAll(oldString, newString);
             
            //Rewriting the input text file with newContent
             
            writer = new FileWriter(fileToBeModified);
             
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //Closing the resources
                 
                reader.close();
                 
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
	
	
	public static String getPreviousDate() {
		Calendar cal  = Calendar.getInstance();
	    //subtracting a day
	    cal.add(Calendar.DATE, -1);

	    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
	    String result = s.format(new Date(cal.getTimeInMillis()));
	    String resultStr = result+"T00:00:00.000Z";
	    System.out.println(resultStr);
	    return resultStr;
	}
	
	public static String getNextDate() {
		Calendar cal  = Calendar.getInstance();
	    //subtracting a day
	    cal.add(Calendar.DATE, +1);

	    SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
	    String result = s.format(new Date(cal.getTimeInMillis()));
	    String resultStr = result+"T00:00:00.000Z";
	    System.out.println(resultStr);
	    return resultStr;
	}
	
	public static String randomNumber() {
		// create instance of Random class
		Random rand = new Random();
		// Generate random integers in range 0 to 999
		int rand_int = rand.nextInt(1000);
		String randomId = "" + rand_int;
		return randomId;
	}
}
