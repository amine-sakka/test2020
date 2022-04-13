import java.util.List;
import java.util.Optional;
/*
 * SAKKA Amine
 */
public interface Structure {
    // returns any item with the specified color
    // zwraca dowolny element o podanym kolorze
    Optional<Block> findBlockByColor(String color);

    // returns all items from a given material
    // zwraca wszystkie elementy z danego materiału
    List<Block> findBlocksByMaterial(String material);

    //returns the number of all elements making up the structure
    // zwraca wszystkie elementy z danego materiału
    int count();
}

