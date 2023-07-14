import java.util.*;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.*;
class voting_system
{
	public static void main(String args[])throws IOException ,FileNotFoundException
	{
		//do
        //{
			System.out.println("*********************************WELCOME TO ONLINE VOTING SYSTEM*************************");
			System.out.println("\n\n");
			
			System.out.println("  Choose the following Options");
			System.out.println("\n\n");
			System.out.println("    1 for user \t\t\t\t\t\t   2 for admin  ");
		    Scanner sc=new Scanner(System.in);
		    int c=sc.nextInt();
			//Here c is the choice to choose user / admin.
		    switch(c)
		    {
				case 1:
					try
		            {
						File objfile=new File("E:\\java\\project\\file1.txt");
			            String votername,voterid;
			            Scanner sc1=new Scanner(System.in);
			            System.out.println("Please  enter your name:");//votername
			            votername=sc1.nextLine();
						System.out.println("\n");
			            System.out.println("Please  enter your valid voter id number");//voterid
			            voterid=sc1.nextLine();
						System.out.println("\n");
			            FileOutputStream fileout=new FileOutputStream(objfile,true);
			            fileout.write(votername.getBytes());
			            fileout.write("\n".getBytes());
		             	fileout.write(voterid.getBytes());
			            fileout.close();
						
		            }
		            catch(Exception e)
					{
						e.printStackTrace();
		            }
		            Scanner sc1=new Scanner(System.in);
					System.out.println("SECURITY QUESTION:");
					System.out.println("\nWhat is your favorite color:");
			        String color=sc1.nextLine();
			       // System.out.println("favorite color is"+color);
					
				    System.out.println("**********************************");
			        System.out.println("Please choose your area");
			        System.out.println("1 for Vijayawada");
			        System.out.println("2 for Guntur ");
					System.out.println("3 for Nellore");
			        int x=sc.nextInt();
			        System.out.println(x);
			        if(x==1)
			        {
						System.out.println("Welcome to vijayawada polling booth");
					    System.out.println("choose your favourite party");
					    System.out.println("Enter 1 for  party A");
					    System.out.println("Enter 2 for  Party B");
						System.out.println("Enter 3 for  party C");
						
					    int t=sc.nextInt();
					    if(t==1)
						{
							File objfile1=new File("E:\\java\\project\\P1.txt");
			                FileOutputStream fileout=new FileOutputStream(objfile1,true);
			                fileout.write("1".getBytes());
			                fileout.close();
					        System.out.println("Thanks for voting.Your vote is submitted successfully");
				        }
				        else if(t==2)
					    {
							File objfile2=new File("E:\\java\\project\\P2.txt");
			                FileOutputStream fileout=new FileOutputStream(objfile2,true);
			                fileout.write("1".getBytes());
			                fileout.close();
						    System.out.println("Thanks for voting.Your vote is submitted successfully");
				        }
						else
						{
							File objfile3=new File("E:\\java\\project\\P3.txt");
			                FileOutputStream fileout=new FileOutputStream(objfile3,true);
			                fileout.write("1".getBytes());
			                fileout.close();
						    System.out.println("Thanks for voting.Your vote is submitted successfully");
						}
							
			        }
                    else if(x==2)
			        {
						System.out.println("Welcome to Guntur polling booth");
				        System.out.println("choose your favourite party");
				        System.out.println("1 for A party");
				        System.out.println("2 for B Party");
						System.out.println("3 for C Party");
				        int t=sc.nextInt();
				        if(t==1)
						{
							File objfile4=new File("E:\\java\\project\\P4.txt");
			                FileOutputStream fileout=new FileOutputStream(objfile4,true);
			                fileout.write("1".getBytes());
			                fileout.close();
					        System.out.println("Thanks for voting.Your vote is submitted successfully");
				        }
				        else if(t==2)
					    {
						    File objfile5=new File("E:\\java\\project\\P5.txt");
			                FileOutputStream fileout=new FileOutputStream(objfile5,true);
			                fileout.write("1".getBytes());
			                fileout.close();
					      System.out.println("Thanks for voting.Your vote is submitted successfully");
				        }
						else
						{
							File objfile6=new File("E:\\java\\project\\P6.txt");
			                FileOutputStream fileout=new FileOutputStream(objfile6,true);
			                fileout.write("1".getBytes());
			                fileout.close();
					      System.out.println("Thanks for voting.Your vote is submitted successfully");
				        }
							
			        }
					else
					{
						System.out.println("Welcome to Nellore polling booth");
				        System.out.println("choose your favourite party");
				        System.out.println("1 for A party");
				        System.out.println("2 for B Party");
						System.out.println("3 for C Party");
				        int t=sc.nextInt();
				        if(t==1)
						{
							File objfile7=new File("E:\\java\\project\\P7.txt");
			                FileOutputStream fileout=new FileOutputStream(objfile7,true);
			                fileout.write("1".getBytes());
			                fileout.close();
					        System.out.println("Thanks for voting.Your vote is submitted successfully");
				        }
				        else if(t==2)
					    {
						    File objfile8=new File("E:\\java\\project\\P8.txt");
			                FileOutputStream fileout=new FileOutputStream(objfile8,true);
			                fileout.write("1".getBytes());
			                fileout.close();
					      System.out.println("Thanks for voting.Your vote is submitted successfully");
				        }
						else
						{
							File objfile9=new File("E:\\java\\project\\P9.txt");
			                FileOutputStream fileout=new FileOutputStream(objfile9,true);
			                fileout.write("1".getBytes());
			                fileout.close();
					      System.out.println("Thanks for voting.Your vote is submitted successfully");
				        }
							
			        }
						
		     	break;
			    case 2:
					System.out.println("Dear admin please enter login details");
					String user_name,pet_name;
					int password;
					Scanner o=new Scanner(System.in);
					System.out.println("Enter admin name:");
					user_name=o.nextLine();
					System.out.println("Enter password");
					password=sc.nextInt();
					System.out.println("SECURITY QUESTION:");
					System.out.println("what is your pet name:");
					pet_name=o.nextLine();
					if(password==1599)
					{
						System.out.println("yes");
				        System.out.println("please select Area");
				        System.out.println("1 for Vijayawada");
				        System.out.println("2 for Guntur");
						System.out.println("3 for Nellore");
				        int ch=sc.nextInt();
				        File f1=new File("E:\\java\\project\\P1.txt");
					    File f2=new File("E:\\java\\project\\P2.txt");
					    File f3=new File("E:\\java\\project\\P3.txt");
					    File f4=new File("E:\\java\\project\\P4.txt");
						File f5=new File("E:\\java\\project\\P5.txt");
						File f6=new File("E:\\java\\project\\P6.txt");
						File f7=new File("E:\\java\\project\\P7.txt");
						File f8=new File("E:\\java\\project\\P8.txt");
						File f9=new File("E:\\java\\project\\P9.txt");
				        if(ch==1)
						{
							if(f1.length()>f2.length() && f1.length()>f3.length())
							{
								System.out.println("In vijayawada party A won in the elections");
							}
							else if(f2.length()>f1.length() && f2.length()>f3.length())
							{
								System.out.println("In Vijayawada  party B won in the election");
							}
							else
							{
								System.out.println("In Vijayawada party C won in the elections");
							}
				        }
						else if(ch==2)
				        {
							if(f4.length()>f5.length() && f4.length()>f6.length())
							{
								System.out.println("In Guntur party A won in the elections");
							}
							else if(f5.length()>f4.length() && f5.length()>f6.length())
							{
								System.out.println("In Guntur  party B won in the election");
							}
							else
							{
								System.out.println("In Guntut party C won in the elections");
							}
				        }
						else
						{
							if(f7.length()>f8.length() && f7.length()>f9.length())
							{
								System.out.println("In Nellore party A won in the elections");
							}
							else if(f8.length()>f7.length() && f8.length()>f9.length())
							{
								System.out.println("In Nellore  party B won in the election");
							}
							else
							{
								System.out.println("In Nellore party C won in the elections");
							}
				        }
							
		            }
			        else
					{
						System.out.println("Login details are incorrect please try again");
					}	
			    break;
			}
			/*
            File file1=new File("E:\\java\\file1.txt");
            FileReader fr=null;
            String str="";
            try
			{
               fr=new FileReader(file1);
               BufferedReader br=new BufferedReader(fr);           
			   do
			   {
				   if(str.contains(votername))
                   System.out.print("\n Yes entered word is found");
                }while((str=br.readLine())!=null);
            }
            catch (Exception e) {            
             e.printStackTrace();
            }   
		}while(true){*/
	}
}
