public class Bad_LSP {
    
    public static boolean four_stroke_cycle(Engine motor){

        motor.intake();
        motor.compresion();
        motor.power();
        motor.exaust();

        return true;
    } 


    
    public static void main(String[] args) {
        
        Engine motor1 = new Diesel_Engine();
        System.out.println("\nMotor Diesel");
        four_stroke_cycle(motor1);

        Engine motor2 = new Gasoline_Engine();
        System.out.println("\nMotor Combustible");
        four_stroke_cycle(motor2);
    }
}

