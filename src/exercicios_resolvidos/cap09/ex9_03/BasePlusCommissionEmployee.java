package exercicios_resolvidos.cap09.ex9_03;
// Exercise 9.3 Solution: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee using composition.
public class BasePlusCommissionEmployee
{
   private CommissionEmployee commissionEmployee; // composition
   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate, double baseSalary)
   {
      if (baseSalary < 0.0)
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");

      commissionEmployee = 
         new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

      this.baseSalary = baseSalary;
   }

   // return first name
   public String getFirstName()
   {
      return commissionEmployee.getFirstName();
   }

   // return last name
   public String getLastName()
   {
      return commissionEmployee.getLastName();
   } 

   // return social security number
   public String getSocialSecurityNumber()
   {
      return commissionEmployee.getSocialSecurityNumber();
   } 

   // set commission employee's gross sales amount
   public void setGrossSales(double grossSales)
   {
      commissionEmployee.setGrossSales(grossSales);
   } 

   // return commission employee's gross sales amount
   public double getGrossSales()
   {
      return commissionEmployee.getGrossSales();
   } 

   // set commission employee's rate
   public void setCommissionRate(double commissionRate)
   {
      commissionEmployee.setCommissionRate(commissionRate);
   } 

   // return commission employee's rate
   public double getCommissionRate()
   {
      return commissionEmployee.getCommissionRate();
   } 

   // set base salary
   public void setBaseSalary(double baseSalary)
   {
      if (baseSalary < 0.0)
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");

      this.baseSalary = baseSalary;
   }

   // return base-salaried commission employee's base salary
   public double getBaseSalary()
   {
      return baseSalary;
   }

   // calculate base-salaried commission employee's earnings
   public double earnings()
   {
      return getBaseSalary() + commissionEmployee.earnings();
   } 

   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString()
   {
      return String.format("%s %s\n%s: %.2f", "base-salaried", 
         commissionEmployee.toString(), "base salary", getBaseSalary());
   } 
} // end class BasePlusCommissionEmployee


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
