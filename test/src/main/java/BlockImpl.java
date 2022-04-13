import java.util.stream.Stream;
/*
 * SAKKA Amine
 */
public class BlockImpl implements Block{
    private  String color;
    private  String material;
    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }

    @Override
    public Stream<Block> toStream() {
        return Stream.of(this);
    }

    public BlockImpl(String color, String material) {
        this.color = color;
        this.material = material;
    }


}
