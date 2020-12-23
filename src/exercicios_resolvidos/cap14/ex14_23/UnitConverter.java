package exercicios_resolvidos.cap14.ex14_23;

// Exercise 14.23 Solution: UnitConverter.java
// Application converts from selected units to other selected units.
// NOTE: unit names must always be entered in the plural form.

public class UnitConverter
{
   public static double convert(String from, String to, int num)
   {
      String lengthUnits[] = {"inches", "meters", "feet", "yards"};
      String massUnits[] = {"grams", "carats", "ounces", "slugs"};
      String volumeUnits[] = {"liters", "gallons", "pints", "pecks"};
      double value = num;

      if (isMatch(to, from, lengthUnits)) // convert length
      {
         double feetToInches = 12.0; // number of inches in a foot
         double yardsToFeet = 3.0; // number of feet in a yard
         double metersToYards = 1.0936; // number of yards in a meter

         if (from.equals("meters")) // from meters
         {
            if (to.equals("yards")) // to yards
               value = num * metersToYards;
            else if (to.equals("feet")) // to feet
               value = num * metersToYards * yardsToFeet;
            else if (to.equals("inches")) // to inches
               value = num * metersToYards * yardsToFeet * feetToInches;
         }
         else if (from.equals("yards")) // from yards
         {
            if (to.equals("meters")) // to meters
               value = num / metersToYards;
            else if (to.equals("feet")) // to feet
               value = num * yardsToFeet;
            else if (to.equals("inches")) // to inches
               value = num * yardsToFeet * feetToInches;
         }
         else if (from.equals("feet")) // from feet
         {
            if (to.equals("meters")) // to meters
               value = num / yardsToFeet / metersToYards;
            else if (to.equals("yard")) // to yards
               value = num / yardsToFeet;
            else if (to.equals("inches")) // to inches
               value = num * feetToInches;
         } 
         else if (from.equals("inches")) // from inches
         {
            if (to.equals("meters")) // to meters
               value = num / feetToInches/ yardsToFeet / metersToYards;
            else if (to.equals("yard")) // to yards
               value = num / feetToInches / yardsToFeet;
            else if (to.equals("feet")) // to feet
               value = num / feetToInches;
         } 
      } 
      else if (isMatch(to, from, massUnits)) // convert mass
      {
         double slugsToKilo = 14.5939;
         double caratsToKilo = 0.0002;
         double ouncesToKilo = 0.0283495;
         double kilosToGrams = 1000.0;

         if (from.equals("slugs")) // from slugs
         {
            if (to.equals("ounces")) // to ounces
               value = num * slugsToKilo / ouncesToKilo;
            else if (to.equals("carats")) // to carats
               value = num * slugsToKilo / caratsToKilo;
            else if (to.equals("grams")) // to grams
               value = num * slugsToKilo * kilosToGrams;
         } 
         else if (from.equals("ounces")) // from ounces
         {
            if (to.equals("slugs")) // to slugs
               value = num * ouncesToKilo / slugsToKilo;
            else if (to.equals("carats")) // to carats
               value = num * ouncesToKilo / caratsToKilo;
            else if (to.equals("grams")) // to grams
               value = num * ouncesToKilo * kilosToGrams;
         } 
         else if (from.equals("carats")) // from carats
         {
            if (to.equals("slugs")) // to slugs
               value = num * caratsToKilo / slugsToKilo;
            else if (to.equals("ounces")) // to ounces
               value = num * caratsToKilo / ouncesToKilo;
            else if (to.equals("grams")) // to grams
               value = num * caratsToKilo * kilosToGrams;
         }
         else if (from.equals("grams")) // from grams
         {
            if (to.equals("slugs")) // to slugs
               value = num / kilosToGrams / slugsToKilo;
            else if (to.equals("ounces")) // to ounces
               value = num / kilosToGrams / ouncesToKilo;
            else if (to.equals("carats")) // to carats
               value = num / kilosToGrams / caratsToKilo;
         } 
      } 
      else if (isMatch(to, from, volumeUnits)) // volume
      { 
         double meters3PerPeck = 0.0088097675;
         double meters3PerPint = 0.0004731764;
         double meters3PerGallon = 0.0037854117;
         double meters3PerLiter = 0.001;

         if (from.equals("pecks")) // from pecks
         {
            if (to.equals("gallons")) // to gallons
               value = num * meters3PerPeck / meters3PerGallon;
            else if (to.equals("liters")) // to liters
               value = num * meters3PerPeck / meters3PerLiter;
            else if (to.equals("pints")) // to pints
               value = num * meters3PerPeck / meters3PerPint;
         } 
         else if (from.equals("gallons")) // from gallons
         {
            if (to.equals("pecks")) // to pecks
               value = num * meters3PerGallon / meters3PerPeck;
            else if (to.equals("liters")) // to liters
               value = num * meters3PerGallon / meters3PerLiter;
            else if (to.equals("pints")) // to pints
               value = num * meters3PerGallon / meters3PerPint;
         } 
         else if (from.equals("liters")) // from liters
         {
            if (to.equals("pecks")) // to pecks
               value = num * meters3PerLiter / meters3PerPeck;
            else if (to.equals("gallons")) // to gallons
               value = num * meters3PerLiter / meters3PerGallon;
            else if (to.equals("pints")) // to pints
               value = num * meters3PerLiter / meters3PerPint;
         } 
         else if (from.equals("pints")) // from pints
         {
            if (to.equals("pecks")) // to pecks
               value = num * meters3PerPint / meters3PerPeck;
            else if (to.equals("gallons")) // to gallons
               value = num * meters3PerPint / meters3PerGallon;
            else if (to.equals("liters")) // to liters
               value = num * meters3PerPint / meters3PerLiter;
         } 
      }

      return value;
   } 

   // check if both units are of same type (i.e., length)
   private static boolean isMatch(String firstUnit, 
      String secondUnit, String unit[])
   {
      boolean flag = false, flag2 = false;

      for (int x = 0; x < unit.length; x++) 
      {
         if (firstUnit.equals(unit[x]))
            flag = true;
         if (secondUnit.equals(unit[x]))
            flag2 = true;
        
         if (flag && flag2)
            return true; // same units
      }

      return false;
   } 
} // end class UnitConverter

/**************************************************************************
 * (C) Copyright 1992-2015 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
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
