
/*
 * SAKKA Amine
 */
public class Main {

    public static void main(String[] args) {
        //init
         BlockImpl block1 = new BlockImpl("f0f8ff", "ma1");
         BlockImpl block2 = new BlockImpl("faebd7", "ma2");
         CompositeBlockImpl compostionBlock3 = new CompositeBlockImpl("f5f5dc", "ma3");
         BlockImpl block4 = new BlockImpl("00ffff", "ma2");
         CompositeBlockImpl compostionBlock5 = new CompositeBlockImpl("green", "ma3");
         BlockImpl block6 = new BlockImpl("000000", "ma66");


         Wall myWall =new Wall();
         compostionBlock3.addBlock(block1);
         compostionBlock3.addBlock(compostionBlock5);
         compostionBlock5.addBlock(block6);

        //testing the count function
         System.out.println("wall count it have to be zero");
         System.out.println(myWall.count()); //0

         //adding blocks to the wall
         myWall.addBlock(block1);myWall.addBlock(block2);myWall.addBlock(compostionBlock3);

         //testing the count again
        System.out.println("wall count it have to be 6");
        System.out.println(myWall.count()); //6

        //testing find by color findBlockByColor
        System.out.println("wall findBlockByColor it should say true ");
        System.out.println(myWall.findBlockByColor("faebd7").isPresent()); //true

        System.out.println("wall findBlockByColor it should say true ");
        System.out.println(myWall.findBlockByColor("000000").isPresent()); //true

        System.out.println("wall findBlockByColor it should say false ");
        System.out.println(myWall.findBlockByColor("000001").isPresent()); //false

        //testing find by Material findBlocksByMaterial
        System.out.println("wall findBlockByColor for ma3 it should say 2 and show 2 ");
        //test for ma2
        System.out.println( myWall.findBlocksByMaterial("ma3").stream().count());
        for (Block var : myWall.findBlocksByMaterial("ma3"))
        {
            System.out.printf(var.getMaterial() +"\n");
        }
        //test for m66
        System.out.println("wall findBlockByColor for ma66 it should say 1 and show 1 ");

        System.out.println( myWall.findBlocksByMaterial("ma66").stream().count());
        for (Block var : myWall.findBlocksByMaterial("ma66"))
        {
            System.out.printf(var.getMaterial() +"\n");
        }
        //test for m9
        System.out.println("wall findBlockByColor for m9 it should say 0 and show nothing ");

        System.out.println( myWall.findBlocksByMaterial("m9").stream().count());
        for (Block var : myWall.findBlocksByMaterial("m9"))
        {
            System.out.printf(var.getMaterial() +"\n" );
        }
    }
}
