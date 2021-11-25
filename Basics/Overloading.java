package training;
//Complile time polymorphism
class Overloading
{
    public void code(char c)// Overloading the method,same method name different parameter
    {
         System.out.println(c);
    }
    public void code(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
class Over
{
public static void main(String[] args)
   {
       Overloading obj = new Overloading();
       obj.code('C');
       obj.code('M',18);
   }
}