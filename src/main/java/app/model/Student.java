
package app.model;

<<<<<<< HEAD
public class Student {
    public String ogrenciNo;
    public String adSoyad;
    public String bolum;
=======
import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String ogrenciNo;
    private String adSoyad;
    private String bolum;
>>>>>>> 159fcbc (Kod güncellemeleri yapıldı)

    public Student(String ogrenciNo, String adSoyad, String bolum) {
        this.ogrenciNo = ogrenciNo;
        this.adSoyad = adSoyad;
        this.bolum = bolum;
    }
<<<<<<< HEAD
=======


    public String getOgrenciNo(){
        return ogrenciNo;
    }
    
    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getAdSoyad(){
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad){
        this.adSoyad = adSoyad;
    }

    public String getBolum(){
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
>>>>>>> 159fcbc (Kod güncellemeleri yapıldı)
}
