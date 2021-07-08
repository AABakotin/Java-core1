package lesson5;

import org.w3c.dom.ls.LSOutput;

import java.time.Year;

import static java.lang.System.*;

public class Sotrudnik {

    private String name;
    private String familiya;
    private String otchestvo;
    private String eMail;
    private String emploess;
    private int birthday;
    private long teleFone;
    private int pay;

    public Sotrudnik(String name,String familiya,String otchestvo,String eMail,String emploess,int birthday, long teleFone, int pay){
        this.name = name;
        this.familiya=familiya;
        this.otchestvo=otchestvo;
        this.eMail=eMail;
        this.emploess=emploess;
        this.pay=pay;
        this.teleFone=teleFone;
        this.birthday=birthday;
    }


    public int getAge(){
        return Year.now().getValue()-this.birthday;
}

            public void printInfo () {
            out.printf("Name %s\n familiya %s\n otchestvo %s\n eMail %s\n emploess %s\n birthday %d\n teleFone %d\n Pay %d\n",
                    this.name, this.familiya, this.otchestvo, this.eMail, this.emploess, this.birthday, this.teleFone, this.pay);



        }
}