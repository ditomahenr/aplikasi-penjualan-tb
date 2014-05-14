/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.smktarunabhakti.penjualan.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author ditomahen_r
 */
@Entity
@Table(name="m_Barang")
public class Barang implements Serializable{
    
    
    @Id
    @GeneratedValue(generator = "sytem-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    
    @NotNull
    @Column(name="kode_Barang", nullable=false , length=5)
    // varchar(5), default dari string adalah varchar (255)
    private  String kodebarang;
    
    @NotNull
    @Column(name="nama_Barang" ,nullable=false)
    private  String namaBarang;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKodebarang() {
        return kodebarang;
    }

    public void setKodebarang(String kodebarang) {
        this.kodebarang = kodebarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    
}
