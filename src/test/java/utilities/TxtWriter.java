package utilities;
import pojos.UmitRegistrantPojos;
import pojos.pojos.AyselPojos;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TxtWriter {
    public static void saveUIAppoinmentData(AyselPojos ayp){

        try {
           FileWriter fw = new FileWriter(ConfigReader.getProperty("appoinment_data"),true);
            BufferedWriter bw= new BufferedWriter(fw);
            bw.append(ayp.toString()+ "\n"); // buradaki toString(); Pojo C'daki meth. calistiracak
            bw.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void saveUIRegistrantData(UmitRegistrantPojos registrant) {

        try {
            FileWriter fw = new FileWriter(ConfigReader.getProperty("applicant_data"), true);

            // file creation
            // location + fileName + txt

            BufferedWriter bw = new BufferedWriter(fw);

            bw.append(registrant.toString() + "\n");
            bw.close();

        }catch (Exception e) {
            e.printStackTrace();

        }

    }
}
