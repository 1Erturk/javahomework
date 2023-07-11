package labwork3;

import java.util.Scanner;

/**
 *
 *
 * I did not use (.equals) method. I used (.equalsIgnoreCase).
 * Because (.equalsIgnoreCase) method is not case sensitive. So this method is more convenient.
 * I learned this method from internet(tasarimkodlama.com).
 *
 *
 */

public class Calculator {
    Scanner input= new Scanner(System.in);
    String initialScale;
    String targetScale;

    public String getInitialScale() {
        System.out.print("Enter initial scale (Celsius or Fahrenheit):");
        initialScale= getValidScale1();
        return "";
    }

    public String getValidScale1() {
        String initialScale;

        try {
            initialScale= input.nextLine();
            if(initialScale.equalsIgnoreCase("Celsius") || initialScale.equalsIgnoreCase("Fahrenheit")) {
                return initialScale;
            }else {
                throw new Exception();
            }
        }
        catch (Exception e) {
            System.out.print("Enter a valid scale (Celsius or Fahrenheit):");
            initialScale= input.nextLine();

            if(initialScale.equalsIgnoreCase("Celsius") || initialScale.equalsIgnoreCase("Fahrenheit")) {
                return initialScale;
            }else {
                System.out.print("Enter a valid scale (Celsius or Fahrenheit):");
                initialScale= getValidScale1();
            }

        }
        return initialScale;
    }



    public String getTargetScale() {
        System.out.print("Enter target scale (Celsius or Fahrenheit):");
        targetScale= getValidScale2();
        return "";
    }

    public String getValidScale2() {
        String targetScale;

        try {
            targetScale= input.nextLine();
            if(targetScale.equalsIgnoreCase("Celsius") || targetScale.equalsIgnoreCase("Fahrenheit")) {
                return targetScale;
            }else {
                throw new Exception();
            }
        }
        catch (Exception e) {
            System.out.print("Enter a valid scale (Celsius or Fahrenheit):");
            targetScale= input.nextLine();

            if(targetScale.equalsIgnoreCase("Celsius") || targetScale.equalsIgnoreCase("Fahrenheit")) {
                return targetScale;
            }else {
                System.out.print("Enter a valid scale (Celsius or Fahrenheit):");
                targetScale= getValidScale1();
            }

        }
        return targetScale;
    }

    public void getTemperature() {
        System.out.print("Enter the temperature value to be converted:");
         double temperature= getValidScale3();
    }

    public double getValidScale3() {
        double temperature;

        if(initialScale.equalsIgnoreCase("Celsius") && targetScale.equalsIgnoreCase("Celsius")) {
            try {
                temperature= input.nextInt();
                if(temperature<-273) {
                    throw new Exception();
                } else {
                    System.out.println("The converted temperature is: " +temperature +" celsius");
                }
            }
            catch (Exception e) {
                System.out.print("Enter a valid temperature (celsius):");
                input.nextLine();
                temperature= getValidScale3();
            }
            //System.out.println("The converted temperature is: " +temperature +" celsius");
            return temperature;
        }

        else if(initialScale.equalsIgnoreCase("Fahrenheit") && targetScale.equalsIgnoreCase("Fahrenheit")) {
            try {
                temperature= input.nextInt();
                if(temperature<-459) {
                    throw new Exception();
                } else {
                    System.out.println("The converted temperature is: " +temperature +" fahrenheit");
                }
            }
            catch (Exception e) {
                System.out.print("Enter a valid temperature (fahrenheit):");
                input.nextLine();
                temperature= getValidScale3();
            }
            //System.out.println("The converted temperature is: " +temperature +" fahrenheit");
            return temperature;
        }

        else if(initialScale.equalsIgnoreCase("Celsius") && targetScale.equalsIgnoreCase("Fahrenheit")) {
            try {
                temperature= input.nextInt();
                if(temperature<-273) {
                    throw new Exception();
                } else {
                    System.out.println("The converted temperature is: " +(32+((temperature*18)/10)) +" fahrenheit");
                }
            }
            catch (Exception e) {
                System.out.print("Enter a valid temperature (celsius):");
                input.nextLine();
                temperature= getValidScale3();
            }
            //System.out.println("The converted temperature is: " +(32+((temperature*18)/10)) +" fahrenheit");
            return (32)+((18*temperature)/10);
        }

        else if(initialScale.equalsIgnoreCase("Fahrenheit") && targetScale.equalsIgnoreCase("Celsius")) {
            try {
                temperature= input.nextInt();
                if(temperature<-459) {
                    throw new Exception();
                } else {
                    System.out.println("The converted temperature is: " +((temperature-32)*10)/18 +" celsius");
                }
            }
            catch (Exception e) {
                System.out.print("Enter a valid temperature (fahrenheit):");
                input.nextLine();
                temperature= getValidScale3();
            }
            //System.out.println("The converted temperature is: " +((temperature-32)*10)/18 +" celsius");
            return ((temperature-32)*10)/18;
        }

        return 0;
    }

    public void get() {
        Calculator calculator= new Calculator();
        calculator.getInitialScale();
        calculator.getTargetScale();
        calculator.getTemperature();
    }

    public boolean exit() {
        System.out.println("Would you like to exit (yes/no)");
        String yesOrNo;
        boolean b= true;
        yesOrNo= input.nextLine();

        if(yesOrNo.equals("yes")) {
            b= false;
            return b;
        } else if(yesOrNo.equals("no")) {
            System.out.println();
            get();
        }
        return b;
    }






    //TEST
    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        calculator.get();

        for (int i = 0; calculator.exit(); i++) {
            calculator.exit();
        }

    }




}
