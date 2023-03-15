package stringhw;

public class Methodparameter {

    // Library total Methodparameter and string concatenation

    static int Libraryrecord(int x,int y){
        return x+y;
    }
    static float Libraryrecord(float A,float B){
        return A * B;

    }

    public static void main(String[] args){
        Methodparameter Library = new Methodparameter();
        int total = Libraryrecord(6767,6767);
        System.out.println("Total amount payable:"+" "+ total);
        float Grosstotal = Libraryrecord(76.565f,5656.7878f);
        System.out.println("Total gross Amount:"+" "+Grosstotal);


    }

}


