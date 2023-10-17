class SalesMan {
    String name;
    int salesmancode;
    double amount;
    double commission;
  void sales(String nm, int code,double at) {
      name = nm;
      salesmancode = code;
      amount = at;
  }
  void calcommission(){
     if(amount>=2000 && amount<=5000)
     {
         commission=0.10*amount;
         System.out.println(commission);
      }
     else if(amount>5000){
         commission=0.12*amount;
         System.out.println(commission);
     }
     else{
         commission=0.8*amount;
         System.out.println(commission);
     }
  }
}
public class Sale {
    public static void main(String[] args) {

        SalesMan sc= new SalesMan();
        sc.sales("om",556652,5000);
        sc.calcommission();
    }
}
