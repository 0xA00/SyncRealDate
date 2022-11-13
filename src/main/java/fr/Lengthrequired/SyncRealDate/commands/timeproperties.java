package fr.Lengthrequired.SyncRealDate.commands;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class timeproperties {
    public static void createFileifNE(){
    File file = new File("plugins/timeproperties.props");
    try {
        if (!file.exists()) {
            file.createNewFile();
            Properties props = new Properties();
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(file);
            props.load(fis);
            props.setProperty("timezone","0");
            props.setProperty("daylightsaving","false");
            props.store(fos, "heure d'été et timezone");
            fis.close();
            fos.close();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }


    }
    public static int getTimezone(){
        File file = new File("plugins/timeproperties.props");
        Properties props = new Properties();
        int timezone = 0;
        try {
            if (!file.exists()) {
                createFileifNE();
            }
            FileInputStream fis = new FileInputStream(file);
            props.load(fis);
            timezone = Integer.parseInt(props.getProperty("timezone"));
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return timezone;
    }
    public static void setTimezone(int timezone){
        File file = new File("plugins/timeproperties.props");
        Properties props = new Properties();
        try {
            if (!file.exists()) {
                createFileifNE();
            }
            FileInputStream fis = new FileInputStream(file);
            props.load(fis);
            props.setProperty("timezone",Integer.toString(timezone));
            FileOutputStream fos = new FileOutputStream(file);
            props.store(fos, "timezone");
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static boolean getDaylightsaving(){
        File file = new File("plugins/timeproperties.props");
        Properties props = new Properties();
        boolean daylightsaving = false;
        try {
            if (!file.exists()) {
                createFileifNE();
            }
            FileInputStream fis = new FileInputStream(file);
            props.load(fis);
            daylightsaving = Boolean.parseBoolean(props.getProperty("daylightsaving"));
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return daylightsaving;
    }

    public static void setDaylightsaving(boolean daylightsaving){
        File file = new File("plugins/timeproperties.props");
        Properties props = new Properties();
        try {
            if (!file.exists()) {
                createFileifNE();
            }
            FileInputStream fis = new FileInputStream(file);
            props.load(fis);
            props.setProperty("daylightsaving",Boolean.toString(daylightsaving));
            FileOutputStream fos = new FileOutputStream(file);
            props.store(fos, "daylightsaving");
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
