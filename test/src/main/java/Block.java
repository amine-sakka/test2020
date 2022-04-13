import java.util.stream.Stream;
/*
 * SAKKA Amine
 */
public interface Block {
    String getColor();
    String getMaterial();
    Stream<Block> toStream();
}
