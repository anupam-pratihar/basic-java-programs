package demo;

class CalculatorDemo{
    public int add(int num1,int num2){
        return num1 + num2;
    }
}

// let's say we don't have the Calculator java file
// But we have the class file, and we need to add another feature to that,
// so you can create one more class

class CalcAdv{
    public int add(int num1,int num2){
        return num1 + num2;
    }

    public int sub(int num1,int num2){
        return num1 - num2;
    }
}
// when you write the advance calc do we need to write the add method again
// instead of repeating that you can simply fetch add from above class
// you can do that from the concept of Inheritance
// you just need to say
// class NewCalcAdv extends CalculatorDemo
// now CalculatorDemo class becomes super class, parent class, baseclass
// and NewCalcAdv becomes subclass, child class, derived class
class NewCalcAdv extends CalculatorDemo{
    public int sub(int num1,int num2){
        return num1 - num2;
    }
}

class CalcVeryAdv extends NewCalcAdv{
    public int multi(int num1, int num2){
        return num1 * num2;
    }
}

public class InheritanceDemo {
    public static void main(String[] args){

        CalculatorDemo calc_object_1 = new CalculatorDemo();

        int result = calc_object_1.add(5,6);
        System.out.println(result);
        System.out.println(calc_object_1.add(5,6));
        System.out.println();

        CalcAdv adv_calc_object = new CalcAdv();
        int result_1 = adv_calc_object.add(8,5);
        int result_2 = adv_calc_object.sub(20,5);

        System.out.println(result_1);
        System.out.println(result_2);
        System.out.println();

        NewCalcAdv new_adv_calc_object = new NewCalcAdv();
        int result_3 = new_adv_calc_object.add(10,5);
        int result_4 = new_adv_calc_object.sub(50,5);

        System.out.println(result_3);
        System.out.println(result_4);
        System.out.println();

        CalcVeryAdv advanced_calc_object = new CalcVeryAdv();
        int result_5 = advanced_calc_object.add(10,5);
        int result_6 = advanced_calc_object.sub(50,5);
        int result_7 = advanced_calc_object.multi(50,5);

        System.out.println(result_5);
        System.out.println(result_6);
        System.out.println(result_7);


    }

}