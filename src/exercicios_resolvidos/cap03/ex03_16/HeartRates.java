package exercicios_resolvidos.cap03.ex03_16;

// Exercise 3.16 Solution: HeartRates.java
// Maintains information about a person's maximum and target hear rates.
// Note: This class assumes that the birth month, day and year are correct values.
public class HeartRates
{
   private String firstName;
   private String lastName;
   private int birthYear;
   private int currentYear;
   
   // constructor
   public HeartRates(String firstName, String lastName, int birthYear, int currentYear)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.birthYear = birthYear;  
      this.currentYear = currentYear;  
   } 

   // returns the first name
   public String getFirstName()
   {
      return firstName;
   } 

   // sets the first name
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   } 

   // returns the last name
   public String getLastName()
   {
      return lastName;
   } 

   // sets the last name
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   } 

   // returns the year of birth
   public int getBirthYear()
   {
      return birthYear;
   } 

   // sets the year of birth
   public void setBirthYear(int birthYear)
   {
      this.birthYear = birthYear;
   } 

   // returns the year of birth
   public int getCurrentYear()
   {
      return currentYear;
   } 

   // sets the current year
   public void setCurrentYear(int currentYear)
   {
      this.currentYear = currentYear;
   } 

   // returns the person's age in years
   public int getAge()
   {
      return getCurrentYear() - getBirthYear();
   } 

   // returns the maximum heart rate
   public int getMaximumHeartRate()
   {
      return 220 - getAge();
   } 

   // returns the minimum target heart rate (50% of maximum heart rate)
   public double getMinimumTargetHeartRate()
   {
      return .5 * getMaximumHeartRate();
   }

   // returns the maximum target heart rate (85% of maximum heart rate)
   public double getMaximumTargetHeartRate()
   {
      return .85 * getMaximumHeartRate();
   } 
} // end class HeartRates



/**************************************************************************
 * (C) Copyright 1992-2015 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
