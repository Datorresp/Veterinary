package model;

public class Date{

  //ATRIBUTOS

  private int day;
  private int month;
  private int year;

  //CONSTRUCTOR

  public Date(int day, int month, int year){

    this.day = day;
    this.month = month;
    this. year = year;
  }

  //day

  public int getDay(){

    return day;
  }

  public void setDay(int day){

    this.day = day;
  }

  //month

  public int getMonth(){

    return month;
  }

  public void setMonth(int month){

    this.month = month;
  }

  //year

  public int getYear(){

    return year;
  }

  public void setYear(int year){

    this.year = year;
  }
}