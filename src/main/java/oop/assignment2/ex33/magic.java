package oop.assignment2.ex33;


public class magic {
    public String yourFuture() {
        int choice = 0;
        String answer = "";
        choice = (int) (Math.random() * ((4 - 1) + 1) + 1);
        if(choice == 1) {
            answer = "\nYes";
        }else if(choice == 2){
            answer = "\nNo";
        }else if(choice == 3){
            answer = "\nMaybe";
        }else{
            answer = "\nAsk again later.";
        }
        return answer;
    }
}
