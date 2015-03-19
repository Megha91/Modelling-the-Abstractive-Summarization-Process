 import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class  WordCount{
  
  public static int linecount(String fileName){


	  

	    long numChar = 0;
	  long numLine=0;
	   
	   
	  
	  BufferedReader br = null;
	  String sCurrentLine = null;
	  StringBuilder contents = new StringBuilder();
	  String result=null;
	  
		try {

		 

			br = new BufferedReader(new FileReader(fileName));

			while ((sCurrentLine = br.readLine()) != null) {
				
		        // contents.append(System.getProperty("line.separator"));
				/*sCurrentLine=    sCurrentLine.toString().replaceAll(". This is ", " and ");
				sCurrentLine=    sCurrentLine.toString().replaceAll(". It is ", " and ");
				sCurrentLine=    sCurrentLine.toString().replaceAll(". The ", " ");
				sCurrentLine=    sCurrentLine.toString().replaceAll("the ", " ");
				sCurrentLine=    sCurrentLine.toString().replaceAll(". A ", " ");
				sCurrentLine=    sCurrentLine.toString().replaceAll(" a ", " ");
				sCurrentLine=    sCurrentLine.toString().replaceAll(". An ", " ");
				sCurrentLine=    sCurrentLine.toString().replaceAll(" an ", " ");
				sCurrentLine=    sCurrentLine.toString().replaceAll(" etc.", " ");*/
		        
		        contents.append(sCurrentLine);
				
				System.out.println(contents);
				numLine++;
			}
		//	System.out.println(contents);
			 /*System.out.println("Number of characters: " + contents.length());
			  System.out.println("Number of words: " + wordcount(contents.toString()));
			  System.out.println("Number of lines: " + numLine);
*/
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return (int) numLine;
	  
	 
	   
	  
	  

	  //  BufferedReader in = null;
  /*try{
  FileReader fileReader = new FileReader(fileName);
  in = new BufferedReader(fileReader);
  linecount(fileName,in);
  }
  catch(IOException e){
  e.printStackTrace();
  }*/
   
  }
  public int wordcount(String fileName){ 
	  
  
	  File file = new File(fileName);
	  Scanner sc = null;
	try {
		sc = new Scanner(new FileInputStream(file));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  int count=0;
	  
	  String words=null;
	  while(sc.hasNext()){
	      words= sc.next();
	      count++;
	      System.out.println("The words are "+words);
	      System.out.println("Number of words: " + count);
	  }
	 // System.out.println("Number of words: " + count);
	 // System.out.println("The words are "+words);
  return count;
  
  }
  
  public int charCount(String file){
	  

	    long numChar = 0;
	  long numLine=0;
	   
	//	System.out.println("filename passed "+file);
	  
	  BufferedReader br = null;
	  String sCurrentLine = null;
	  StringBuilder contents = new StringBuilder();
	  String result=null;
	  
		try {

		 

			br = new BufferedReader(new FileReader(file));

			while ((sCurrentLine = br.readLine()) != null) {
				
		        // contents.append(System.getProperty("line.separator"));
				/*sCurrentLine=    sCurrentLine.toString().replaceAll(". This is ", " and ");
				sCurrentLine=    sCurrentLine.toString().replaceAll(". It is ", " and ");
				sCurrentLine=    sCurrentLine.toString().replaceAll(". The ", " ");
				sCurrentLine=    sCurrentLine.toString().replaceAll("the ", " ");
				sCurrentLine=    sCurrentLine.toString().replaceAll(". A ", " ");
				sCurrentLine=    sCurrentLine.toString().replaceAll(" a ", " ");
				sCurrentLine=    sCurrentLine.toString().replaceAll(". An ", " ");
				sCurrentLine=    sCurrentLine.toString().replaceAll(" an ", " ");
				sCurrentLine=    sCurrentLine.toString().replaceAll(" etc.", " ");*/
		        
		        contents.append(sCurrentLine);
				
				System.out.println(contents);
				//numLine++;
			}
			//System.out.println(contents);	
			 /*System.out.println("Number of characters: " + contents.length());
			  System.out.println("Number of words: " + wordcount(contents.toString()));
			  System.out.println("Number of lines: " + numLine);
*/
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return contents.length();
	  
	 
	   
	  
	  
  }
  
  public static void main(String[] args){}
}