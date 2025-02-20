/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package common;

import dao.InventoryUtils;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Anaclara Ferrando
* @enterpryse FSTailSolutions S.A
 */
public class OpenPdf { 
    public static void OpenById(String id) {
        try {
            File pdfFile = new File(InventoryUtils.billPath + id + ".pdf");

            if (pdfFile.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile); // Abre con la aplicación predeterminada
                } else {
                    // Si Desktop no es compatible, usa ProcessBuilder como alternativa
                    new ProcessBuilder("cmd.exe", "/c", "start", pdfFile.getAbsolutePath()).start();
                }
            } else {
                JOptionPane.showMessageDialog(null, "El archivo no existe: " + pdfFile.getAbsolutePath());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo: " + e.getMessage());
        }
    }
}