/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobamvc;

import java.awt.ScrollPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Orenji
 */
public class ViewPraktikum extends JFrame{
    
    
    JTextField jtcari = new JTextField();
    JLabel jlnim = new JLabel("Nim : ");
    JTextField jtnim = new JTextField();
    JLabel jlnama = new JLabel("Nama : ");
    JTextField jtnama = new JTextField();
    JLabel jlalamat = new JLabel("Alamat : ");
    JTextField jtalamat = new JTextField();
    
    JButton jbcari = new JButton("Cari NIM");
    JButton jbtambah = new JButton("Tambah");
    JButton jbupdate = new JButton("Update");
    JButton jbreset = new JButton("Reset");
    
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Nim", "Nama", "Alamat"};
    
    public ViewPraktikum(){
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Mahasiswa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(750,400); // x , y
        
        add(scrollPane);
        scrollPane.setBounds(20, 50, 480, 300);
        
        //CARI NIM =============================================================
        add(jtcari);
        jtcari.setBounds(20, 20, 360, 20);
        
        // NIM =================================================================
        add(jlnim);
        jlnim.setBounds(510, 20, 90, 20);
        add(jtnim);
        jtnim.setBounds(510, 40, 120, 20);
        
        // NAMA ================================================================
        add(jlnama);
        jlnama.setBounds(510, 60, 90, 20);
        add(jtnama);
        jtnama.setBounds(510, 80, 120, 20);
        
        // ALAMAT ==============================================================
        add(jlalamat);
        jlalamat.setBounds(510, 100, 90, 20);
        add(jtalamat);
        jtalamat.setBounds(510, 120, 120, 20);
        
        
        // BUTTON ==============================================================
        add(jbcari);
        jbcari.setBounds(400, 20, 90, 20);
        
        add(jbtambah);
        jbtambah.setBounds(510, 160, 90, 20);
        
        add(jbupdate);
        jbupdate.setBounds(510, 200, 90, 20);
        
        add(jbreset);
        jbreset.setBounds(510, 240, 90, 20);
    }
    
    
    //Buat ngambil data texfield
    public String getCari(){
        return jtcari.getText();
    }
    
    public String getNim(){
        return jtnim.getText();
    }
    
    public String getNama(){
        return jtnama.getText();
    }
    
    public String getAlamat(){
        return jtalamat.getText();
    }
    
    public String getNimSearch(){
        return jtcari.getText();
    }
    
    public void resetForm(){
        jtnim.setText("");
        jtnama.setText("");
        jtalamat.setText("");
    }
}
