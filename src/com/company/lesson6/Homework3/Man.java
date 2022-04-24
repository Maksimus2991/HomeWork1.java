package com.company.lesson6.Homework3;;

public class Man {
   private String name;
   private int age;
   private Woman wife;


   public Man(String name, int age) {
      this.name = name;
      this.age = age;
   }

   public void setWife(Woman wife) {
      this.wife = wife;
   }
}
