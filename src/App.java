//                                                               TIC TAC TOE
//                                                  SUJIT SWAIN
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    int a,b=0;
         char [][] gameSet={{' ','|',' ','|',' '},
                            {'-','+','-','+','-'},
                            {' ','|',' ','|',' '},
                            {'-','+','-','+','-'},
                            {' ','|',' ','|',' '}};
            printGame(gameSet);
            Scanner sc=new Scanner(System.in);
            while(true){
            System.out.print("\n\nenter the position between (1-9) for X : ");
            a=sc.nextInt();
            System.out.println("\n\n");
            switch(a){
                case 1:
                        gameSet[0][0]='X';
                    printGame(gameSet);
                break;
                case 2:
                        gameSet[0][2]='X';
                    printGame(gameSet);
                break;
                case 3:
                        gameSet[0][4]='X';
                    printGame(gameSet);
                break;
                case 4:
                        gameSet[2][0]='X';
                    printGame(gameSet);
                break;
                case 5:
                        gameSet[2][2]='X';
                    printGame(gameSet);
                break;
                case 6:
                        gameSet[2][4]='X';
                    printGame(gameSet);
                break;
                case 7:
                        gameSet[4][0]='X';
                    printGame(gameSet);
                break;
                case 8:
                        gameSet[4][2]='X';
                    printGame(gameSet);
                break;
                case 9:
                        gameSet[4][4]='X';
                    printGame(gameSet);
                break;

            }
            System.out.println("\n\n");
            if((gameSet[0][0]=='X'&&gameSet[0][2]=='X'&&gameSet[0][4]=='X')||(gameSet[2][0]=='X'&&gameSet[2][2]=='X'&&gameSet[2][4]=='X')||(gameSet[4][0]=='X'&&gameSet[4][2]=='X'&&gameSet[4][4]=='X')||(gameSet[0][0]=='X'&&gameSet[2][2]=='X'&&gameSet[4][4]=='X')||(gameSet[0][4]=='X'&&gameSet[2][2]=='X'&&gameSet[4][0]=='X')||(gameSet[0][0]=='X'&&gameSet[2][0]=='X'&&gameSet[4][0]=='X')||(gameSet[0][2]=='X'&&gameSet[2][2]=='X'&&gameSet[4][2]=='X')||(gameSet[0][4]=='X'&&gameSet[2][4]=='X'&&gameSet[4][4]=='X')){
                System.out.println("X wins"); 
                 b=1;
                break;

            }

            System.out.print("\n\nenter the position between (1-9) for O : ");
            a=sc.nextInt();
            System.out.println("\n\n");
            switch(a){
                case 1:
                        gameSet[0][0]='O';
                    printGame(gameSet);
                break;
                case 2:
                        gameSet[0][2]='O';
                    printGame(gameSet);
                break;
                case 3:
                        gameSet[0][4]='O';
                    printGame(gameSet);
                break;
                case 4:
                        gameSet[2][0]='O';
                    printGame(gameSet);
                break;
                case 5:
                        gameSet[2][2]='O';
                    printGame(gameSet);
                break;
                case 6:
                        gameSet[2][4]='O';
                    printGame(gameSet);
                break;
                case 7:
                        gameSet[4][0]='O';
                    printGame(gameSet);
                break;
                case 8:
                        gameSet[4][2]='O';
                    printGame(gameSet);
                break;
                case 9:
                        gameSet[4][4]='O';
                    printGame(gameSet);
                break;

            }
            if((gameSet[0][0]=='O'&&gameSet[0][2]=='O'&&gameSet[0][4]=='O')||(gameSet[2][0]=='O'&&gameSet[2][2]=='O'&&gameSet[2][4]=='O')||(gameSet[4][0]=='O'&&gameSet[4][2]=='O'&&gameSet[4][4]=='O')||(gameSet[0][0]=='O'&&gameSet[2][2]=='O'&&gameSet[4][4]=='O')||(gameSet[0][4]=='O'&&gameSet[2][2]=='O'&&gameSet[4][0]=='O')||(gameSet[0][0]=='O'&&gameSet[2][0]=='O'&&gameSet[4][0]=='O')||(gameSet[0][2]=='O'&&gameSet[2][2]=='O'&&gameSet[4][2]=='O')||(gameSet[0][4]=='O'&&gameSet[2][4]=='O'&&gameSet[4][4]=='O')){
                System.out.println("O wins");
                b=1;
                break;
            }
        
        }
        if(b==0){
            System.out.println("Game draw");}
        sc.close();

    }
    public static void printGame(char[][] gameSet){
        for(char[] row :gameSet){
            for(char rr:row){
                System.out.print(rr);

            }
            System.out.println();

        }
    }
}

