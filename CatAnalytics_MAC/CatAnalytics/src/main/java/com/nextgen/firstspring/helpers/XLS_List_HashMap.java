package com.nextgen.firstspring.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;








public class XLS_List_HashMap {

	
	
	public static void main(String[] args) throws JSONException  {

		
		/*String efforMatrixPath = "/Users/sakib/Downloads/Efforts Matrix.xlsx";
		String sheetYear = "2017";
		List<Map<String, String>> testdata = getXlsTable(efforMatrixPath,sheetYear);
		
		Set<String> uniqueProjects = new HashSet<String>();
		Set<String> uniqueApplication = new HashSet<String>();
		//get unique projects
		
		for(int i=0;i<testdata.size();i++)
		{
			uniqueProjects.add(testdata.get(i).get("Projects"));
			
			if(!testdata.get(i).get("Application").isEmpty())
			{
				uniqueApplication.add(testdata.get(i).get("Application"));
			}
			
			
		}
		String json = "[ ";
		for(String application : uniqueApplication)
		{
			json+=" { name : '"+application+"' , data : [ ";
			//System.out.println("{"+application);
			for(String projects : uniqueProjects)
			{
				int countAppearence = 0;
				Double totaleffortForThisProject = 0.0;
				for(int i=0;i<testdata.size();i++)
				{
					if(testdata.get(i).get("Application").equals(application) && testdata.get(i).get("Projects").equals(projects))
					{
						totaleffortForThisProject = totaleffortForThisProject + Double.parseDouble(testdata.get(i).get("Efforts(Hrs)"));
						countAppearence++;
						
					}
				}
				json+=totaleffortForThisProject+" , ";
				System.out.println(application +" is involed in -> "+projects+" -> "+countAppearence+" many times and total effor -> "+totaleffortForThisProject);
			}
			
			json = json.substring(0, json.lastIndexOf(","))+" ] } , ";
				
			
		}
		
		json = json.substring(0, json.lastIndexOf(","))+"]";
		
		System.out.println(json);*/
		
		/*
		Map <Integer , String> projectmap = new HashMap<Integer , String>();
		int index = 0;
		
		for(String projects : uniqueProjects)
		{
			projectmap.put(index, projects);
			index++;
		}
		
		
		for (Map.Entry<Integer, String> entry : projectmap.entrySet()) {
		    int projectNumber = entry.getKey();
		    String project = entry.getValue();
		    System.out.println(projectNumber +" - "+project);
		    
		    Set<String> uniqueApplicationForThisProject = new HashSet<String>();
			for(int i=0;i<testdata.size();i++)
			{
				
				if(testdata.get(i).get("Projects").equals(project))
				{
					if(!testdata.get(i).get("Application").isEmpty())
					{
						
						//System.out.println(testdata.get(i).get("Application"));
						uniqueApplicationForThisProject.add(testdata.get(i).get("Application"));
						
					}
					
					
				}
				
			}
			
			
			for(String application : uniqueApplicationForThisProject)
			{
				
				System.out.println("{ \"name\" : \""+application);
				
				
				Double totaleffortPerApplication = 0.0;
				
				
				for(int i=0;i<testdata.size();i++)
				{
					
					if(testdata.get(i).get("Projects").equals(projects))
					{
						if(testdata.get(i).get("Application").equals(application))
						{
							totaleffortPerApplication = totaleffortPerApplication + Double.parseDouble(testdata.get(i).get("Efforts(Hrs)"));
						}
					}
				}
				System.out.println("\t\t"+application+"\t"+totaleffortPerApplication);
			}
			
		    
		}*/
		
		/*Double totaleffort = 0.0;
		
		//String json = "{ \"allProjectEffort\" : { ";
		
		
		for(String projects : uniqueProjects)
		{
			System.out.println("-----------------  "+projects+"  -----------------  ");
			
			// Total efforts for each project
			Set<String> uniqueApplicationForThisProject = new HashSet<String>();
			for(int i=0;i<testdata.size();i++)
			{
				
				if(testdata.get(i).get("Projects").equals(projects))
				{
					if(!testdata.get(i).get("Application").isEmpty())
					{
						
						//System.out.println(testdata.get(i).get("Application"));
						uniqueApplicationForThisProject.add(testdata.get(i).get("Application"));
						
					}
					
					
				}
				
			}
			
			
			for(String application : uniqueApplicationForThisProject)
			{
				
				Double totaleffortPerApplication = 0.0;
				
				
				for(int i=0;i<testdata.size();i++)
				{
					
					if(testdata.get(i).get("Projects").equals(projects))
					{
						if(testdata.get(i).get("Application").equals(application))
						{
							totaleffortPerApplication = totaleffortPerApplication + Double.parseDouble(testdata.get(i).get("Efforts(Hrs)"));
						}
					}
				}
				System.out.println("\t\t"+application+"\t"+totaleffortPerApplication);
			}
			
			
			
		}
		*/
		
		
		
		//json = json.substring(0, json.lastIndexOf(","))+" } }";
		//System.out.println(" ===================  TOTAL EFFORT -> "+totaleffort+" ==================");
		
	
		//System.out.println(json);
		/* int count = 0 ;
		for(int i=0;i<testdata.size();i++)
		{
			if(!testdata.get(i).get("Date").isEmpty())
			{
				String dateArr[] = testdata.get(i).get("Date").split("/");	
				
				//System.out.println(Integer.parseInt(dateArr[1]));
				int month = Integer.parseInt(dateArr[0]);
				
				System.out.println(Month.of(month).name());
				count++;
			}
			
		}
		
		System.out.println(count);*/
		/*Set<String> uniqueEmployees = new HashSet<String>();
		//get unique projects
		
		for(int i=0;i<testdata.size();i++)
		{
			uniqueEmployees.add(testdata.get(i).get("Resource"));
			
		}
		
		
		for(String employess : uniqueEmployees)
		{
			
		}*/
		
		
	/*	
		
		String s = "{ \"DOW Chemical\" : \"12.75\",\"Textron\" : \"11.0\",\"Pangolin\" : \"12.83\",\"Textron & DOW Chemical\" : \"0.25\",\"Missouri 529\" : \"14.6\",\"Milliman\" : \"23.1\",\"Trextron\" : \"4.75\",\"Release 0725\" : \"19.33\",";
		System.out.println();
		System.out.println(s.charAt(s.lastIndexOf(",")));
		
		System.out.println();
*/
	
		String efforMatrixPath = "/Users/sakib/Downloads/Efforts Matrix.xlsx";
		String sheetYear = "2017";
		String weekOfTheMonthPointer = "c";
		System.out.println(getAllEffortsByProject(efforMatrixPath , sheetYear , weekOfTheMonthPointer));
		
		//System.out.println("09/11/2017".split("/")[1].trim());
	}

	public static String getAllEffortsByProject(String efforMatrixPath , String sheetYear , String monthPointer) throws JSONException
	{
		
		List<Map<String, String>> testdata = getXlsTable(efforMatrixPath,sheetYear);
		
		Set<String> uniqueProjects = new HashSet<String>();
		Set<String> uniqueApplication = new HashSet<String>();
		Set<String> uniqueMonth = new LinkedHashSet<String>();
		Set<String> uniqueEmployee = new LinkedHashSet<String>();
		//get unique projects
		
		for(int i=0;i<testdata.size();i++)
		{
			uniqueProjects.add(testdata.get(i).get("Projects").trim());
			
			if(!testdata.get(i).get("Application").isEmpty())
			{
				if(!testdata.get(i).get("Application").equals("All"))
				{
					uniqueApplication.add(testdata.get(i).get("Application").trim());
				}
				
			}
			
			if(!testdata.get(i).get("Resource").isEmpty())
			{
				
				uniqueEmployee.add(testdata.get(i).get("Resource").trim());
								
			}
			
			if(!testdata.get(i).get("Date").isEmpty())
			{
				String month = testdata.get(i).get("Date").split("/")[0].trim();
				
				if(month.equals("01"))
				{
					uniqueMonth.add("Jan");
				}else if(month.equals("02"))
				{
					uniqueMonth.add("Feb");
				}else if(month.equals("03"))
				{
					uniqueMonth.add("Mar");
				}else if(month.equals("04"))
				{
					uniqueMonth.add("Apr");
				}else if(month.equals("05"))
				{
					uniqueMonth.add("May");
				}else if(month.equals("06"))
				{
					uniqueMonth.add("Jun");
				}else if(month.equals("07"))
				{
					uniqueMonth.add("Jul");
				}else if(month.equals("08"))
				{
					uniqueMonth.add("Aug");
				}else if(month.equals("09"))
				{
					uniqueMonth.add("Sep");
				}else if(month.equals("10"))
				{
					uniqueMonth.add("Oct");
				}else if(month.equals("11"))
				{
					uniqueMonth.add("Nov");
				}else if(month.equals("12"))
				{
					uniqueMonth.add("Dec");
				}
			}
			
		}
		
		Double totaleffort = 0.0;
		
		String json = "{ ";
		
		//Analysed year
		
		json+=" \"year\" :  \""+sheetYear.trim()+"\"";
		
		
		
		// getallEfforts
		json += " , \"allProjectEffort\" : {"; 
		
		for(String projects : uniqueProjects)
		{
			System.out.println("-----------------  "+projects+"  -----------------  ");
			
			// Total efforts for each project
			Double initialEffort = 0.0;
			int numberOfRowsForProject = 0;
			for(int i=0;i<testdata.size();i++)
			{
				
				if(testdata.get(i).get("Projects").trim().equals(projects))
				{
					//System.out.println(testdata.get(i).get("Efforts(Hrs)"));
					numberOfRowsForProject++;
					Double effortEachrow = Double.parseDouble(testdata.get(i).get("Efforts(Hrs)").trim());
					initialEffort = initialEffort+effortEachrow;
					//System.out.println(effortEachrow);
				}
				
			}
			
			totaleffort = totaleffort + initialEffort;
			
			json+="\""+projects.trim()+"\" : "+initialEffort+",";
			System.out.println(" Number of rows for Project "+projects+" -> "+ numberOfRowsForProject);

			System.out.println(" Total effor for Project "+projects+" -> "+ initialEffort);
			
		}
		
		json = json.substring(0, json.lastIndexOf(","))+" }";
		System.out.println(" ===================  TOTAL EFFORT -> "+totaleffort+" ==================");
		
		
		
		
		
		
		json+=" , \"allApplicationByEffortPerProject\" : ";
		
		/*for(String projects : uniqueProjects)
		{
			System.out.println("-----------------  "+projects+"  -----------------  ");
			
			json+="\""+projects.trim()+"\" : {";
			
			// Total efforts for each project
			Set<String> uniqueApplicationForThisProject = new HashSet<String>();
			for(int i=0;i<testdata.size();i++)
			{
				
				if(testdata.get(i).get("Projects").equals(projects))
				{
					if(!testdata.get(i).get("Application").isEmpty())
					{
						
						//System.out.println(testdata.get(i).get("Application"));
						uniqueApplicationForThisProject.add(testdata.get(i).get("Application"));
						
					}
					
					
				}
				
			}
			
			for(String application : uniqueApplicationForThisProject)
			{
				Double totaleffortPerApplication = 0.0;
				
				
				for(int i=0;i<testdata.size();i++)
				{
					
					if(testdata.get(i).get("Projects").equals(projects))
					{
						if(testdata.get(i).get("Application").equals(application))
						{
							totaleffortPerApplication = totaleffortPerApplication + Double.parseDouble(testdata.get(i).get("Efforts(Hrs)"));
						}
					}
				}
				System.out.println("\t\t"+application+"\t"+totaleffortPerApplication);
				json+="\""+application.trim()+"\" : "+totaleffortPerApplication+",";
				
			}
			json = json.substring(0, json.lastIndexOf(","))+" }";
			
			json+=" , ";
		}
		

		json = json.substring(0, json.lastIndexOf(","))+" }";
		
		json+=" }";*/
		
		json += "[ ";
		for(String application : uniqueApplication)
		{
			json+=" { \"name\" : \""+application+"\" , \"data\" : [ ";
			//System.out.println("{"+application);
			for(String projects : uniqueProjects)
			{
				int countAppearence = 0;
				Double totaleffortForThisProject = 0.0;
				for(int i=0;i<testdata.size();i++)
				{
					if(testdata.get(i).get("Application").trim().equals(application) && testdata.get(i).get("Projects").trim().equals(projects))
					{
						totaleffortForThisProject = totaleffortForThisProject + Double.parseDouble(testdata.get(i).get("Efforts(Hrs)").trim());
						countAppearence++;
						
					}else if(testdata.get(i).get("Application").trim().equals("All") && testdata.get(i).get("Projects").trim().equals(projects))
					{
						
						totaleffortForThisProject = totaleffortForThisProject + (Double.parseDouble(testdata.get(i).get("Efforts(Hrs)").trim())/uniqueApplication.size());
						countAppearence++;
					}
				}
				
				if(totaleffortForThisProject == 0.0)
				{
					json+="null , ";
				}else
				{
					totaleffortForThisProject = Math.round(totaleffortForThisProject * 100.0) / 100.0;
					json+=totaleffortForThisProject+" , ";
				}
				
				System.out.println(application +" is involed in -> "+projects+" -> "+countAppearence+" many times and total effor -> "+totaleffortForThisProject);
			}
			
			json = json.substring(0, json.lastIndexOf(","))+" ] } , ";
				
			
		}
		
		json = json.substring(0, json.lastIndexOf(","))+"]";
				
		
		
		
		
			json+=" , \"allApplicationByEffort\" : {";
		
				json += "\"allApplication\" : ["; 
		
				for(String application : uniqueApplication)
				{
					json+="\""+application+"\" , ";
				}
		
				json = json.substring(0, json.lastIndexOf(","))+"]";
				
				
				json += " , \"totalEfforPerApplication\" : ["; 
				
				for(String application : uniqueApplication)
				{
					Double totaleffortForThisApplication = 0.0;
					for(int i=0;i<testdata.size();i++)
					{
						if(testdata.get(i).get("Application").trim().equals(application))
						{
							if(!testdata.get(i).get("Efforts(Hrs)").isEmpty())
							{
								totaleffortForThisApplication = totaleffortForThisApplication + Double.parseDouble(testdata.get(i).get("Efforts(Hrs)").trim());
								
							}
							
							
						}else if(testdata.get(i).get("Application").trim().equals("All"))
						{
							if(!testdata.get(i).get("Efforts(Hrs)").isEmpty())
							{
								totaleffortForThisApplication = totaleffortForThisApplication + (Double.parseDouble(testdata.get(i).get("Efforts(Hrs)").trim())/uniqueApplication.size());
								
							}
							
						}
					}
					
					if(totaleffortForThisApplication == 0.0)
					{
						json+="null , ";
					}else
					{
						totaleffortForThisApplication = Math.round(totaleffortForThisApplication * 100.0) / 100.0;
						json+=totaleffortForThisApplication+" , ";
					}
					
					System.out.println(" Total effor for application -> "+application+" is -> "+totaleffortForThisApplication+" HR's");

					
				}
				
				json = json.substring(0, json.lastIndexOf(","))+"]";
				
				
			json+="  }";
		
			
			
			
			json+=" , \"yearlyEffortTrendByApplication\" : {";
			
			json += "\"availableMonth\" : ["; 
			for(String month : uniqueMonth)
			{
				json+="\""+month+"\" , ";
			}
	
			json = json.substring(0, json.lastIndexOf(","))+"]";
			
			
			json += " , \"monthlyEffortPerApplication\" : "; 
			
			json += "[ ";
			for(String application : uniqueApplication)
			{
				json+=" { \"name\" : \""+application+"\" , \"data\" : [ ";
				//System.out.println("{"+application);
				for(String month : uniqueMonth)
				{
					int countAppearence = 0;
					Double totaleffortForThisMonth = 0.0;
					for(int i=0;i<testdata.size();i++)
					{
						if(testdata.get(i).get("Application").trim().equals(application) && getMonth(testdata.get(i).get("Date").trim()).equals(month))
						{
							totaleffortForThisMonth = totaleffortForThisMonth + Double.parseDouble(testdata.get(i).get("Efforts(Hrs)").trim());
							countAppearence++;
							
						}else if(testdata.get(i).get("Application").trim().equals("All") && getMonth(testdata.get(i).get("Date").trim()).equals(month))
						{
							totaleffortForThisMonth = totaleffortForThisMonth + (Double.parseDouble(testdata.get(i).get("Efforts(Hrs)").trim())/uniqueApplication.size());
							countAppearence++;
							
						}
					}
					
					if(totaleffortForThisMonth == 0.0)
					{
						json+="null , ";
					}else
					{
						totaleffortForThisMonth = Math.round(totaleffortForThisMonth * 100.0) / 100.0;
						json+=totaleffortForThisMonth+" , ";
					}
					
					System.out.println("In month -> "+month+" , application -> "+application +"'s total effort is -> "+totaleffortForThisMonth+" and appearded-> "+countAppearence+" many times" );
				}
				
				json = json.substring(0, json.lastIndexOf(","))+" ] } , ";
					
				
			}
			
			json = json.substring(0, json.lastIndexOf(","))+"]";
			
			json+="  }";
			
			
			// ========================================
			
			//getCurrentMonth
			json+=" , \"monthTitle\" :  \""+getCurrentMonth(monthPointer).trim()+"\"";
			
			
			json+=" , \"weeklyEffortPerAppByEmp\" : [";
			
			int empNo = 1;
			boolean changed = false;
			for(String emplyee : uniqueEmployee)
			{
				// unique app that this employee worked on
				Set<String> uniqueAppForThisEmployee = new LinkedHashSet<String>();
				for(int i=0;i<testdata.size();i++)
				{
					if(testdata.get(i).get("Resource").trim().equals(emplyee))
					{
						if(!testdata.get(i).get("Application").equals("All"))
						{
							uniqueAppForThisEmployee.add(testdata.get(i).get("Application").trim());
						}
						
					}
				}
				
				//System.out.println(emplyee+empNo);
				
				System.out.println("========= "+emplyee+" worked on ==========");
				
				for(String appForThisEmp : uniqueAppForThisEmployee)
				{
					System.out.println(appForThisEmp);
					json+=" { ";
							
							if(changed==false)
							{
								json+=" \"id\" : \""+emplyee+"\" ,";	
								changed = true;
								
							}else
							{
								json+=" \"linkedTo\" : \""+emplyee+"\" ,";	
							}
							
							json+=" \"name\" : \""+emplyee+"\" ,";
							json+=" \"stack\" : "+empNo+" ,";
							json+=" \"data\" : [ ";
										
									
												// how many weeks of data avaialbe for current month
												for(int week=0;week<4;week++)
												{
													//get total effor of this week
													
													Double eff = getThisWeeksOfDataForEmployee(emplyee, testdata, week, uniqueApplication.size() , appForThisEmp , monthPointer);
													
													if(eff==null)
													{
														json+=" [\""+appForThisEmp+"\" , null] , ";
													}else
													{
														/*
														 * 
														 * 
														 *  Here make chages.........
														 * 
														 * 
														 */
														
														eff = (100/25) *  eff;
														json+=" [\""+appForThisEmp+"\" , "+eff+"] , ";
													}
													
												}
							json = json.substring(0, json.lastIndexOf(","))+"]";
							
					json+="  } , ";
				}
				
				changed = false;
				empNo++;
			}
			
			
			
			json = json.substring(0, json.lastIndexOf(","))+"]";
			
			
			//Get all unique Projects
						
			String uniqProjecArr[] = new String[uniqueProjects.size()];  			
			int i = 0;			
			for(String projects : uniqueProjects)
			{
				uniqProjecArr[i++] = projects;				
			}
			
			JSONArray mJSONArray = new JSONArray(Arrays.toString(uniqProjecArr));
			json+=" , \"uniqueProjects\" :  "+mJSONArray+"";
			
			
			
			
			
			
			//end json
	json+="  }";
	System.out.println(json);
	
		//System.out.println(json);
		
		return json;
	}
	
	
	
	
	public static Double getThisWeeksOfDataForEmployee(String employee , List<Map<String, String>> testdata , int week , int sizeOfUniqueApp , String application , String monthPointer)
	{
		List<Map<String, String>> filteredThisMonthData = getAvailableDataForThisMonthOnly(testdata , monthPointer);
		Double effort = 0.0;
		
		for(int i=0;i<filteredThisMonthData.size();i++)
		{
			if(filteredThisMonthData.get(i).get("Resource").trim().equals(employee))
			{
				if(week==0)
				{
					// 1st week
					if(Integer.parseInt(filteredThisMonthData.get(i).get("Date").trim().split("/")[1].trim())<=7)
					{
						if(filteredThisMonthData.get(i).get("Application").trim().equals(application))
						{
							effort = effort+Double.parseDouble(testdata.get(i).get("Efforts(Hrs)").trim());
							
						}else if(filteredThisMonthData.get(i).get("Application").trim().equals("All"))
						{
							effort = effort + (Double.parseDouble(testdata.get(i).get("Efforts(Hrs)").trim())/sizeOfUniqueApp);
														
						}
						
					}
					continue;
				}else if(week==1)
				{
					// 2nd week
					if(Integer.parseInt(filteredThisMonthData.get(i).get("Date").trim().split("/")[1].trim())>7 && Integer.parseInt(filteredThisMonthData.get(i).get("Date").trim().split("/")[1].trim())<=14)
					{
						if(filteredThisMonthData.get(i).get("Application").trim().equals(application))
						{
							effort = effort+Double.parseDouble(testdata.get(i).get("Efforts(Hrs)").trim());
							
						}else if(filteredThisMonthData.get(i).get("Application").trim().equals("All"))
						{
							effort = effort + (Double.parseDouble(testdata.get(i).get("Efforts(Hrs)").trim())/sizeOfUniqueApp);
														
						}
						
					}
					continue;
				}else if(week==2)
				{
					// 3rd week
					if(Integer.parseInt(filteredThisMonthData.get(i).get("Date").trim().split("/")[1].trim())>14 && Integer.parseInt(filteredThisMonthData.get(i).get("Date").trim().split("/")[1].trim())<=21)
					{
						if(filteredThisMonthData.get(i).get("Application").trim().equals(application))
						{
							effort = effort+Double.parseDouble(testdata.get(i).get("Efforts(Hrs)").trim());
							
						}else if(filteredThisMonthData.get(i).get("Application").trim().equals("All"))
						{
							effort = effort + (Double.parseDouble(testdata.get(i).get("Efforts(Hrs)").trim())/sizeOfUniqueApp);
														
						}
						
					}
					continue;
				}else if(week==3)
				{
					// 4th week
					if(Integer.parseInt(filteredThisMonthData.get(i).get("Date").trim().split("/")[1].trim())>21 && Integer.parseInt(filteredThisMonthData.get(i).get("Date").trim().split("/")[1].trim())<=31)
					{
						if(filteredThisMonthData.get(i).get("Application").trim().equals(application))
						{
							effort = effort+Double.parseDouble(testdata.get(i).get("Efforts(Hrs)").trim());
							
						}else if(filteredThisMonthData.get(i).get("Application").trim().equals("All"))
						{
							effort = effort + (Double.parseDouble(testdata.get(i).get("Efforts(Hrs)").trim())/sizeOfUniqueApp);
														
						}
						
					}
					continue;
				}
			}
		}
		
		if(effort == 0.0)
		{
			return null;
		}else
		{
			return (Math.round(effort * 100.0) / 100.0);
		}
		
	}
	
	public static String getCurrentMonth(String monthPointer)
	{
		Date date= new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		String mon = "";
		int month = cal.get(Calendar.MONTH)+1;
		
		if(monthPointer.equals("p"))
		{
			month = month -1;
		}
		
		if(month<10)
		{
			mon = String.valueOf("0"+month);
		}else
		{
			mon = String.valueOf(month);
		}
		
		if(mon.equals("01"))
		{
			return "January";
		}else if(mon.equals("02"))
		{
			return "February";
		}else if(mon.equals("03"))
		{
			return "March";
		}else if(mon.equals("04"))
		{
			return "April";
		}else if(mon.equals("05"))
		{
			return "May";
		}else if(mon.equals("06"))
		{
			return "June";
		}else if(mon.equals("07"))
		{
			return "July";
		}else if(mon.equals("08"))
		{
			return "August";
		}else if(mon.equals("09"))
		{
			return "September";
		}else if(mon.equals("10"))
		{
			return "October";
		}else if(mon.equals("11"))
		{
			return "November";
		}else if(mon.equals("12"))
		{
			return "December";
		}else
		{
			return "";
		}
		
	}
	
	public static List<Map<String, String>> getAvailableDataForThisMonthOnly(List<Map<String, String>> testdata , String monthPointer)
	{
		Date date= new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		String mon = "";
		int month = cal.get(Calendar.MONTH)+1;
		
		if(monthPointer.equals("p"))
		{
			month = month -1;
		}
		
		
		if(month<10)
		{
			mon = String.valueOf("0"+month);
		}else
		{
			mon = String.valueOf(month);
		}
		
		List<Map<String, String>> filteredThisMonthData = new ArrayList<Map<String,String>>();
		for(int i=0;i<testdata.size();i++)
		{
			if(!testdata.get(i).get("Date").isEmpty())
			{
				
				if(testdata.get(i).get("Date").trim().split("/")[0].trim().equals(mon)) 
				{
					filteredThisMonthData.add(testdata.get(i));
					
				}
				
			}
		}
		return filteredThisMonthData;
		
	}
	
	
	public static String getMonth(String dateFromExcel)
	{
		String month = dateFromExcel.split("/")[0].trim();
		
		if(month.equals("01"))
		{
			return "Jan";
		}else if(month.equals("02"))
		{
			return "Feb";
		}else if(month.equals("03"))
		{
			return "Mar";
		}else if(month.equals("04"))
		{
			return "Apr";
		}else if(month.equals("05"))
		{
			return "May";
		}else if(month.equals("06"))
		{
			return "Jun";
		}else if(month.equals("07"))
		{
			return "Jul";
		}else if(month.equals("08"))
		{
			return "Aug";
		}else if(month.equals("09"))
		{
			return "Sep";
		}else if(month.equals("10"))
		{
			return "Oct";
		}else if(month.equals("11"))
		{
			return "Nov";
		}else if(month.equals("12"))
		{
			return "Dec";
		}else
		{
			return "";
		}
	}
	public static List<Map<String, String>> getXlsTable(String xlsPath , String xlsSheetName)
	{
		
		try{
			Xls_Reader xls = new Xls_Reader(xlsPath);
			
			//System.out.println(xls.getColumnCount(""));
			 
			List<String> columns = new ArrayList<String>(xls.getColumnCount(xlsSheetName));
			    for(int i = 0; i < xls.getColumnCount(xlsSheetName); i++){
			        columns.add(xls.getCellData(xlsSheetName, i, 1));
			    	//System.out.println(xls.getCellData("Sheet1", i, 1));
			    }
			    
			   /* for(int i=0;i<columns.size();i++)
			    {
			    	System.out.println(columns.get(i));
			    }*/    
			    
			    
			List<Map<String,String>> data = new ArrayList<Map<String,String>>();
			for(int rowNum=2;rowNum<=xls.getRowCount(xlsSheetName);rowNum++)
			{
				Map<String,String> row = new LinkedHashMap<String, String>(columns.size());
				for(int colNum=0;colNum<xls.getColumnCount(xlsSheetName);colNum++)
				{
					row.put(columns.get(colNum), xls.getCellData(xlsSheetName, colNum, rowNum));
					//System.out.print(xls.getCellData("Sheet1", colNum, rowNum)+"  ");
				}
				//System.out.println();
				data.add(row);
			}
			return data;
		}catch(Throwable t)
		{
			return null;
		}
		
	}
	
}