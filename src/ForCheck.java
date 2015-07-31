import com.dynnoil.cloneables.*;

/**
 * Класс, демонстрирующий работу
 * метода toClone() интерфейса Cloneables
 *
 * Created by krukov.ly on 31.07.2015.
 */
public class ForCheck {

    public static void main(String[] args) {

        Guitar rythmGuitar = new Guitar(8, 24);
        Guitar soloGuitar = new Guitar(6, 28);
        Bass bass = new Bass(4, 24);
        Drums drums = new Drums(15);

        Gang myGang = new Gang(rythmGuitar, soloGuitar, bass, drums);
        Gang newGang = (Gang) myGang.toClone();
        System.out.println("Before changes: ");
        System.out.println("Old gang");
        myGang.printAboutGang();
        System.out.println("Cloned gang");
        newGang.printAboutGang();

        Guitar rythmGuitarNG = new Guitar(100, 150);
        Guitar soloGuitarNG = new Guitar(120, 99);
        Bass bassNG = new Bass(40, 500);
        Drums drumsNG = new Drums(1);

        newGang = new Gang(rythmGuitarNG, soloGuitarNG, bassNG, drumsNG);
        System.out.println("After changes cloned gang: ");
        System.out.println("Old gang");
        myGang.printAboutGang();
        System.out.println("Cloned and changed gang: ");
        newGang.printAboutGang();
    }
}
