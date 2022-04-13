import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
/*
 * SAKKA Amine
 */
public class CompositeBlockImpl extends BlockImpl implements CompositeBlock{

    private List<Block> blocks = new LinkedList<>();
    @Override
    public List<Block> getBlocks() {
        return this.blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    public void addBlock(Block block) {
        this.blocks.add(block);
    }
    @Override
    public Stream<Block> toStream() {
        return Stream.concat(
                super.toStream(),
                blocks.stream().flatMap(Block::toStream)
        );
    }
    public CompositeBlockImpl(String color, String material) {
        super(color,material);

    }

}
