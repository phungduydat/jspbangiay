/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.text.DecimalFormat;

/**
 *
 * @author duyda
 */
public class doitien {
    public String doitien1(Double p) {
         String patternTienTe = "###,###,000";
        DecimalFormat formatTienTe = new DecimalFormat(patternTienTe);
        String stringTienTe= formatTienTe.format(p); 
        return stringTienTe;
    }
}
