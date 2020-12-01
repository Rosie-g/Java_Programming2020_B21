package day35_CustomClass;

import java.time.LocalDate;

public class Car {

   public String brand; // instance variables
   public String model;
   public String color;
   public int year;

   public void setInfo(String carBrand, String carModel, String carColor, int carYear){
      brand = carBrand;
      model = carModel;
      color = carColor;
      year = carYear;
   }

   public void getInfo(){
      System.out.println(year+" "+brand+" "+model+" "+color);
   }
}
