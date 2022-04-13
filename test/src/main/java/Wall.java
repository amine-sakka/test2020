import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
/*
 * SAKKA Amine
 */
public class Wall implements Structure {
    private  List<Block> blocks = new LinkedList<Block>();

    public Wall() {
    }

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }
    public void addBlock(Block block) {
        //to add stuff when i want to
        blocks.add(block);
    }
    
    @Override
    public Optional<Block> findBlockByColor(String color) {
        // returns any element with the specified color
        // zwraca dowolny element o podanym kolorze
        if(color!=null){
            return(blocks.stream().flatMap(Block::toStream).filter(bl->bl.getColor().equals(color)).findFirst());
        }
        return Optional.empty();
    }


    @Override
    public List<Block> findBlocksByMaterial(String material) {
        // returns all items from a given material
        // zwraca wszystkie elementy z danego materiału
        if(material!=null){
            return(blocks.stream().flatMap(Block::toStream).filter(bl->bl.getMaterial().equals(material)).toList());
        }
        return null;
    }

    @Override
    public int count() {
        //returns the number of all elements making up the structure
        //zwraca liczbę wszystkich elementów tworzących strukturę
        return  (int)blocks.stream().flatMap(Block::toStream).count();
    }
}

