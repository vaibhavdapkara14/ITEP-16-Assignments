class Program8{
    public static void main(String args[]){
        double height_traingle = 20;
        double area_in_meter = 0.8;

        double area_in_cm = area_in_meter*1000;
        double base_traingle = (2*area_in_cm)/height_traingle;

        System.out.println("Base of Traingle = " + base_traingle + "m");


    }
}