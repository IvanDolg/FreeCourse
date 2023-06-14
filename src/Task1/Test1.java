package Task1;

public class Test1 {
    private int a = 0;
    private int b = 0;
    public Test1(int a, int b){
        this.a = a;
        this.b = b;
    }
    public String printNum(){
        return "First num: " + this.a +
                "\nSecond num: " + this.b;
    }
    public String sumNum(){
        return "Sum of el: " + (this.a + this.b);
    }
    public String maxNum(){
        if (this.a > this.b){
            return "First number is bigger then second";
        } else {
            return "Second number is bigger then first";
        }
    }
}
