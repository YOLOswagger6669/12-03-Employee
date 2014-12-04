public class Employee
{
  String name;
  Double hourlyWage;
  int hoursWorked;
  public Employee(String empname, double wage, int hours)
  {
    name=empname;
    hourlyWage=wage;
    hoursWorked=hours;
  }
  public String getName()
  {
    return name;
  }
  public double getWage()
  {
    return hourlyWage;
  }
  public int getHours()
  {
    return hoursWorked;
  }
  public double getWeeklySalary()
  {
    return hoursWorked*hourlyWage;
  }
  public double getYearlySalary()
  {
    return 52*getWeeklySalary();
  }
  public String toString()
  {
    return "name: "+name+", wage: $"+hourlyWage+", hours: "+hoursWorked;
  }
  public void setName(String newName)
  {
    name=newName;
  }
  public void setWage(double newWage)
  {
    hourlyWage=newWage;
  }
  public void setHours(int h)
  {
    hoursWorked=h;
  }
  public void giveRaise()
  {
    hourlyWage++;
  }
}
