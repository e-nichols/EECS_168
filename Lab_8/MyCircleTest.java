public class MyCircleTest {
	
	public static void main(String[] args) {
		
                // Declare a new circle called myCircle
                MyCircle myCircle = new MyCircle();
                //Assign the radius a value of 5.5
                myCircle.rad = 5.5;
                
                System.out.println("My circle has a radius of "+myCircle.rad);
               
                //Declare two doubles, theArea and theCircum
                double theArea = myCircle.find_area();
                
                double theCircum = myCircle.circumf();
                
                //Display a message to the screen "The area is <put the area here>"
                System.out.println("The area is "+ theArea);
                
                //Display a message to the screen "The circumference is <put the circumference here>"
                System.out.println("The circumference is " + theCircum);
                
                //Using only a method call to diameter(), write a message to the screen "The diameter is <put the diameter here>"
                System.out.println("The diameter is "+ myCircle.find_diam());
	}	

}
