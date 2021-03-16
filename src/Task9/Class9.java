package Task9;

public class Class9 {
    public static void main(String[] args) {
        Costumer costumer = new Costumer();
        Costumer costumer1 = new Costumer(29);
        Costumer costumer2 = new Costumer();
        costumer.setBirthDate(20);
        costumer2.setBirthDate(30);
        CostumerService t  = new CostumerService();
        t.isBornBefore(costumer,15);//
    }
}
class Costumer{
    int birthDate;

    public Costumer(){

    }
    public Costumer (int birthDate){
        this.birthDate = birthDate;
    }
    public void setBirthDate(int birthDate){
        this.birthDate = birthDate;
    }
    public int getBirthDate(){
        return birthDate;
    }

}
class CostumerService {
    int date;

    public void setDate(int date) {
        this.date=date;
    }
    public void isBornBefore (Costumer costumer , int date){
        if (costumer.birthDate > date){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
