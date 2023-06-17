public class If_Statement {
    public static void main(String[] args) {

        int amount = 20;

        if(amount < 20){
            System.out.println("Facts");
        }else if(amount > 20){
            System.out.println("Factsn't");
        }else{
            System.out.println("Whatever");
        }


        int i = 0;
        while(true){
            System.out.println("In the loop");

            if(i == 6){
                break;
            }
            i++;
            //System.out.println("Out the loop");
        }
    }
}
