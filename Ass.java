
package ass;

public class Ass {

        public static void main(String[] args) {
    int length, width;
    length = 20;
    width = 30;
    double area = calculatePerimeter(length, width); 
    System.out.println(area);
    }
    public static double calculatePerimeter(int length, int width) {
    return (length + width)*2;

}
}
