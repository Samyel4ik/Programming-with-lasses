package Task1;
//Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
// Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.


public class Test1 {
    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.x = 10;
        num.y = 20;
        num.print();
        System.out.println("Сумма данных чисел: "+num.sumOfNumbers());
        System.out.println("Наибольшее и двух чисел: "+num.maxNum());
    }
}

class Numbers {
    int x, y;

    void print(){
        System.out.println(x + " " + y);
    }
    void changingAVariable(){

    }
    int sumOfNumbers(){
        return x+y;
    }
    int maxNum (){
       int max = 0;
        if (x>y){
           max = x;
        }else {
            max = y;
        }
        return max;
    }
}

