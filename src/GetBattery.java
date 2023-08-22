public class GetBattery {

    public GetBattery(){
        System.out.println("Get Battery");
    }

    public static int getBattery(int[] events) {
        int carga = 50;  
        
        for (int event : events) {
            if (event > 0) {
                carga += event; 
                if (carga > 100) {
                    carga = 100; 
                }
            } else {
                carga += event;  
                if (carga < 0) {
                    carga = 0; 
                }
            }
        }
        
        return carga;
    }
}