package net.smktarunabhakti.penjualan.domain;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javassist.bytecode.analysis.Util;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "trx_jual_header")
public class penjualan implements Serializable{
        
        @Id
        @GeneratedValue(generator = "system-uuid")
        @GenericGenerator(name = "system-uuid" ,strategy = "uuid2")
        private String id;
        
        @Column(name = "waktu_transaksi")
        @Temporal(javax.persistence.TemporalType.TIMESTAMP)
        private  Date tgl;
        
        @Column(nullable = false)
        private String kasir;
        
        @Column(name = "n_Struk" ,nullable =false)
        private String noStruk;
        
        //import org.hibernate.annotations.Cascade;
        //import org.hibernate.annotations.CascadeType;
        //Import java.Util.list
        @OneToMany(mappedBy = "header")
        @Cascade(value = CascadeType.ALL)
        private List<PenjualanDetail> listPenjualanDetail; 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKasir() {
        return kasir;
    }

    public void setKasir(String kasir) {
        this.kasir = kasir;
    }

    public String getNoStruk() {
        return noStruk;
    }

    public void setNoStruk(String noStruk) {
        this.noStruk = noStruk;
    }

    public Date getTgl() {
        return tgl;
    }

    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }

}
