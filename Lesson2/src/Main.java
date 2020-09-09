public class Main {
    public static void main(String[] args) {

        Stacks stacks = new Stacks(10);
        stacks.add("Hello".toCharArray());
//        stacks.add("e");
//        stacks.add("l");
//        stacks.add("l");
//        stacks.add("o");


        while(!stacks.isEmpty()){
            System.out.print(stacks.pop());
        }

        //System.out.println(stacks.size());

    }
}
