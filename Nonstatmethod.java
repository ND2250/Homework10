package stringhw;

public class Nonstatmethod {
 // Companies debit amount details with using
  //  Type of Nonstatic method and String concatenation
    void companydata(){

        int Y = 2689;
        int Z = 786678;

        System.out.println("Debit amount:" + "Total debited" + "  " + Y);
    }



    public static void main(String[] args){
        Nonstatmethod details = new Nonstatmethod();
        details.companydata();


    }
}
