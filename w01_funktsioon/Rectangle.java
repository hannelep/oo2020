public class Rectangle {
    
    public int area(int a, int b) {
        int area;
        area = a*b;
        return area;
    }

     public static void main(String[] args){
         Rectangle a = new Rectangle();
         System.out.println("Rectangle area is " + a.area(5,3));
     }  
    
}