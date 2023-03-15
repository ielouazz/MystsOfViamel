import java.io.*;  
import java.util.Scanner;
//THINGS ARE NOT NAMED WELL SINCE I WAS MAINLY TESTING THINGS OUT
//I'LL TRY MY BEST TO EXPLAIN THEM  
public class testy_bingo {  
   public static void main(String[] args) throws Exception {
      printStuff();
      addLine();
      printStuff();
      int gabagool = searchCsvLine(0, "BINGO");
      System.out.println(gabagool);
      updateCSV("PINK", gabagool, 1);
      printStuff();}
      
   public static void printStuff() throws Exception{  
      //parsing a CSV file into Scanner class constructor
      //make sure to change the file location to where the csv is in your computer  
      Scanner sc = new Scanner(new File("C:\\Users\\maryb\\OneDrive\\Desktop\\Make it Clean\\Codes\\Software Engineering\\data_test.csv"));  
      sc.useDelimiter(",");   //sets the delimiter pattern  
      while (sc.hasNext()){  //returns a boolean value   
         System.out.print(sc.next());}  //find and returns the next complete token from this scanner  
      sc.close();}  //closes the scanner

   public static void addLine() throws Exception{
      FileWriter pw = new FileWriter("C:\\Users\\maryb\\OneDrive\\Desktop\\Make it Clean\\Codes\\Software Engineering\\data_test.csv",true);
      //creates a new line in the csv file
      //BINGO, BONGO
      //can be used to put character information into the csv
      //i.e. Mary, Human, Wizard, 0, 0, 0, 0, tutorial
      //name, race, class, health, gold, xp, items, location
      pw.append("\n");
      pw.append("BINGO"); //append player_name variable in the future
      pw.append(", ");
      pw.append("BONGO");
      pw.flush();
      pw.close();}
      
   public static int searchCsvLine(int searchColumnIndex, String searchString) throws Exception {
      //tries to find a specific word in a collumn
      //for example, looking for a specific name in the name collumn
      //could be used to update the ap
      BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\maryb\\OneDrive\\Desktop\\Make it Clean\\Codes\\Software Engineering\\data_test.csv"));
      String line;
      int count = 0;
      while ( (line = br.readLine()) != null ){
         String[] values = line.split(", ");
         if(values[searchColumnIndex].equals(searchString)){
            break;}}
         count += 1;
      br.close();
      //returns the row that the information was on
      //i.e. "Mary" is in the 3rd row, returns 3
      return count;}
      
   public static void updateCSV(String replace, int row, int col) throws Exception {
      FileReader inputFile = new FileReader("C:\\Users\\maryb\\OneDrive\\Desktop\\Make it Clean\\Codes\\Software Engineering\\data_test.csv");
      // Read existing file 
      CSVReader reader = new CSVReader(inputFile);
      List<String[]> csvBody = reader.readAll();
      // get CSV row column  and replace with by using row and column
      csvBody.get(row)[col] = replace;
      reader.close();
      // Write to CSV file which is open
      FileWriter writer = new FileWriter("C:\\Users\\maryb\\OneDrive\\Desktop\\Make it Clean\\Codes\\Software Engineering\\data_test.csv",true);
      writer.writeAll(csvBody);
      writer.flush();
      writer.close();} 
}  