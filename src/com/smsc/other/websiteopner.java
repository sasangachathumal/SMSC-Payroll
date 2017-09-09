/*
websiteopner run=new websiteopner();
run.siteopner("https://www.facebook.com");
*/

package com.smsc.other;

import java.io.IOException;
import javax.swing.JOptionPane;

public class websiteopner {
    public void siteopner(String sitelink){
        try {
            Process p;
            p=Runtime.getRuntime().exec("cmd /c start " + sitelink);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error :"+e);
        }
    }
}
