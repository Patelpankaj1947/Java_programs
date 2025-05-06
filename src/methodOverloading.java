//  method overloading
class sum{
    void operation(int a){
        System.out.println("sum of a +a is :"+a+a);
    }

    void operation(int a ,int b){
        System.out.println("sum of a and b :"+(a+b));
    }
}



public class methodOverloading {
    public static void main(String[] args) {
        sum obj= new sum();
        obj .operation(2);
        obj.operation(3,6);

    }
}
