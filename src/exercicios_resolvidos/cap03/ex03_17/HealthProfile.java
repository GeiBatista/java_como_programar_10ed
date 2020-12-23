package exercicios_resolvidos.cap03.ex03_17;

// Exercise 3.17 Solution: HealthProfile.java
// Maintains information about a person's maximum and target hear rates.
// Note: This class assumes values passed to the set methods are correct.
public class HealthProfile
{
   private String firstName;
   private String lastName;
   private String gender;
   private int birthYear;
   private int currentYear;
   private double height;
   private double weight;
   
   // constructor
   public HealthProfile(String firstName, String lastName, String gender, 
      double height, double weight, int birthYear, int currentYear)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.gender = gender;
      this.height = height;
      this.weight = weight;
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

   // returns the person's gender
   public String getGender()
   {
      return gender;
   } 

   // sets the person's gender
   public void setGender(String gender)
   {
      this.gender = gender;
   } 

   // returns the year of birth
   public int getBirthYear()
   {
      return birthYear;
   } 

   // sets the current year
   public void setCurrentYear(int currentYear)
   {
      this.currentYear = currentYear;
   }

   // returns the year of birth
   public int getCurrentYear()
   {
      return currentYear;
   } 

   // sets the year of birth
   public void setBirthYear(int birthYear)
   {
      this.birthYear = birthYear;
   } 

   // returns the person's height
   public double getHeight()
   {
      return height;
   } 

   // sets the person's height
   public void setHeight(double height)
   {
      this.height = height;
   }

   // returns the person's weight
   public double getWeight()
   {
      return weight;
   } 

   // sets the person's weight
   public void setWeight(double weight)
   {
      this.weight = weight;
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
   
   public double getBMI()
   {
      return (getWeight() * 703) / (getHeight() * getHeight());
   } 
   
   // displays the person's health profile
   public void displayHealthProfile()
   {
      System.out.printf("%nHEALTH PROFILE FOR: %s %s%n", getFirstName(), getLastName());
      System.out.printf("Gender: %s%n", getGender());
      System.out.printf("Age: %d%n", getAge());
      System.out.printf("Height (in inches): %.1f%n", getHeight());
      System.out.printf("Weight (in pounds): %.1f%n", getWeight());
      System.out.printf("Maximum heart rate: %d%n", getMaximumHeartRate());
      System.out.println("Target heart rate range:");
      System.out.printf("   Minimum: %.0f%n", getMinimumTargetHeartRate());
      System.out.printf("   Maximum: %.0f%n", getMaximumTargetHeartRate());
      System.out.printf("BMI: %f%n%n", getBMI());
      System.out.println("BMI VALUES");
      System.out.println("Underweight: less than 18.5");
      System.out.println("Normal:      between 18.5 and 24.9");
      System.out.println("Overweight:  between 25 and 29.9");
      System.out.println("Obese:       30 or greater");   
   } 
} // end class HealthProfile



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
