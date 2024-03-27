import java.util.*;

public class SalariedWorker {
    int salary_rate;
    SalariedWorker(String name,int salary_rate)
    {
        this.salary_rate=salary_rate;
        System.out.println("DETAILS : ");
        System.out.println("NAME : "+name);
        System.out.println("SALARY RATE : "+salary_rate);
    }
}

class salaried_Worker extends SalariedWorker
{
  salaried_Worker(String name, int salary_rate,String type)
  {
      super(name,salary_rate);
      System.out.println("TYPE: "+ type);
  }
  void ComPay(int hours)
  {
      int wage=hours*salary_rate;
      System.out.println("TOTAL PAY : " + wage);
  }
}

class SalariedWorkerJob
{
    public static void main(String args[])
    {
        salaried_Worker obj1=new salaried_Worker("LILY", 12000,"SALARIED WORKER");
        obj1.ComPay(40);
    }
}
