package ProtoTypePattern.UnderstandingCopying;

import com.sun.xml.internal.ws.developer.Serialization;
import com.sun.xml.internal.ws.developer.SerializationFeature;

import java.awt.dnd.DragSource;

public class Demo {
    public static void main(String[] args) throws  Exception{
        Person Alakbar = new Person(new String[]{"Alakbar","Aliasgarli"},
                new Adress("Yasamal",163));

        Person Rashad = Alakbar.clone();

//        Rashad.names[0] = "Rashad";
//        Rashad.address.streetName = "Xetai";
        Rashad.address.streetNumber = 169;
        Rashad.names[1] = "Mahammadzade";
        Rashad.names[0] = "Rashad";


        System.out.println(Alakbar);
        System.out.println(Rashad);


    }

}
