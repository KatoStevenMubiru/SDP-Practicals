

public class ClientColor {
    public static void main(String[] args){
        //Original Color objects

        ColorPrototype blue = new BlueColor();
        ColorPrototype red = new RedColor();

        //ColorPrototype Color objects
        ColorPrototype anotherBlue = blue.clone();
        ColorPrototype anotherRed = red.clone();

        
                // The cloned colors are exact copies of the original colors
                System.out.println("Original Blue Color: " + ((BlueColor) blue).getColorName());
                System.out.println("Cloned Blue Color: " + ((BlueColor) anotherBlue).getColorName());
                System.out.println("Original Red Color: " + ((RedColor) red).getColorName());
                System.out.println("Cloned Red Color: " + ((RedColor) anotherRed).getColorName());
      
  
    }
}
