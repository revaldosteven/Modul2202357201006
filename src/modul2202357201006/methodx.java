
package modul2202357201006;

import javax.swing.JOptionPane;


public class methodx {

    
    public double luas_lingkaran(double diameter) {
        double jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }
    
    public double volume_tabung(double diameter, double tinggi) {
        double luas = luas_lingkaran(diameter);
        double volume = luas * tinggi;
        return volume;
    }
    
    public double volume_kerucut(double diameter, double tinggi) { 
        double luas = luas_lingkaran(diameter);
        double volume = (luas * tinggi) / 3.0;
        return volume;
    }
    
    public double volume_bola(double diameter) { 
        double jari2 = diameter / 2.0;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jari2, 3);
        return volume;
    }

    public static void main(String[] args) {
        methodx mt = new methodx();
        String pilihanString = JOptionPane.showInputDialog(null,
                "Pilih Bangun Ruang:\n1. Tabung\n2. Kerucut\n3. Bola",
                "Pilihan", JOptionPane.QUESTION_MESSAGE);
        int pilihan = Integer.parseInt(pilihanString);
        double diameter, tinggi;
        
        if (pilihan == 1) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Diameter Lingkaran"));
            tinggi = Double.parseDouble(JOptionPane.showInputDialog(null,"Masukkan Tinggi" ));
            double volume_tabung = mt.volume_tabung(diameter, tinggi);
            JOptionPane.showMessageDialog(null, "Volume Tabung: "+ volume_tabung);
            System.out.println("Volume Tabung: " + volume_tabung);
            
        } else if (pilihan == 2) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Diameter Lingkaran"));
            tinggi = Double.parseDouble(JOptionPane.showInputDialog(null,"Masukkan Tinggi" ));
            double volume_kerucut = mt.volume_kerucut(diameter, tinggi);
            JOptionPane.showMessageDialog(null, "Volume Kerucut: "+ volume_kerucut);
            System.out.println("Volume Kerucut: " + volume_kerucut);
            
        } else if (pilihan == 3) {
            diameter = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Diameter Lingkaran"));
            double volume_bola = mt.volume_bola(diameter);
            JOptionPane.showMessageDialog(null, "Volume Bola: "+ volume_bola);
            System.out.println("Volume Bola: " + volume_bola);

        } else { 
            JOptionPane.showMessageDialog(null, "Pilihan Tidak Ada");
        }
        System.exit(0);
    }
}    
          
        
        
