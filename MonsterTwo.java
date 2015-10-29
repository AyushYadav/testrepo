import java.util.*;
public class MonsterTwo
{
    static char[][] battleBoard=new char [10][10];

    //Filling the array with '*' the default value

    public static void buildBattleBoard(){
        for (char[] row: battleBoard){
            Arrays.fill(row,'-');
        }
    }

    //Creating the Battle board from the array, just printing procedure

    public static void redrawBoard(){
        int k=1;
        while(k<31){
            System.out.print("*");
            k++;
        }
        System.out.println();
        for (int i=0;i<battleBoard.length;i++){
            for (int j=0;j<battleBoard[i].length;j++)
                System.out.print("|"+battleBoard[i][j]+"|");
            System.out.println();
        }
        k=1;
        while(k<31){
            System.out.print("*");
            k++;
        }
        System.out.println();
    }

//Class Variables
    public final String TOMBSTONE="Here lies a Dead Monster";
    private int health=500;
    private int attack=20;
    private int movement=2;
    private boolean isAlive=true;
    public char nameChar1='B';
    public int xPosition=0;
    public int yPosition=0;
    public String name="Big MonsterTwo";
    public static int numberOfMonsters=0;

//Get Functions
    public int getAttack(){
        return attack;
    }
    public int getMovement(){
        return movement;
    }
    public int getHealth(){
        return health;
    }
    public boolean getAlive(){
        return isAlive;
    }
    public void setHealth(int decreaseHealth){
        health-=decreaseHealth;
        if (health<0)
            isAlive=false;
    }
    public void setHealth(double decrease){
        int intDecrease=(int)decrease;
        health-=intDecrease;
        if (health<0)
            isAlive=false;
    }

    public void moveMonster(MonsterTwo[] monster, int arrayItemIndex){
        boolean isSpaceOpen=true;
        int maxXBoardSpace=battleBoard.length-1;
        int maxYBoardSpace=battleBoard[0].length-1;
        while(isSpaceOpen){
            int randMoveDirection=(int)(Math.random()*4);
            int randMoveDistance=(int)( Math.random()*(this.getMovement()+1));
            System.out.println(randMoveDirection+"  "+randMoveDistance);
            battleBoard[this.yPosition][this.xPosition]='-';
            if(randMoveDirection==0){
                if((this.yPosition)-randMoveDistance<0){
                    this.yPosition=0;
                }else{
                    this.yPosition-=randMoveDistance;
                }
            }else if(randMoveDirection==1){
                if((this.xPosition)+randMoveDistance>maxXBoardSpace){
                    this.xPosition=maxXBoardSpace;
                }else{
                    this.xPosition+=randMoveDistance;
                }
            }else if(randMoveDirection==2){
                if((this.yPosition)+randMoveDistance>maxYBoardSpace){
                    this.yPosition=maxYBoardSpace;
                }else{
                    this.yPosition+=randMoveDistance;
                }
            }else if(randMoveDirection==3){
                if((this.xPosition)-randMoveDistance<0){
                    this.xPosition=0;
                }else{
                    this.xPosition-=randMoveDistance;
                }
            }
            for (int i =0;i<monster.length;i++){
                if(i==arrayItemIndex)continue;
                if (onMySpace(monster,i,arrayItemIndex)) {
                    isSpaceOpen = true;
                    break;
                }else{
                    isSpaceOpen=false;

                }
            }
        }                                               //END OF WHILE LOOP
        battleBoard[this.yPosition][this.xPosition]=this.nameChar1;
    }                                                   //END OF moveMonster()

    public boolean onMySpace(MonsterTwo[] monster, int indexToChk1, int indexToChk2){
        if((monster[indexToChk1].xPosition==monster[indexToChk2].xPosition)&&
                (monster[indexToChk1].yPosition==monster[indexToChk2].yPosition))
                return true;
        else
            return false;
    }//End of MySpace

    //Customised Constructer fro creating of monsters

    public MonsterTwo(int newHealth, int newAttack, int newMovement, String name){
        this.health=newHealth;
        this.attack=newAttack;
        this.movement=newMovement;
        this.name=name;
        int maxXBoardSpace=battleBoard.length-1;
        int maxYBoardSpace=battleBoard[0].length-1;
        int randNumX,randNumY;
        do{
            randNumX=(int)(Math.random()*maxXBoardSpace);
            randNumY=(int)(Math.random()*maxYBoardSpace);
        } while(battleBoard[randNumX][randNumY]!='-');
        this.xPosition=randNumX;
        this.yPosition=randNumY;
        this.nameChar1=this.name.charAt(0);
        battleBoard[this.yPosition][this.xPosition]=this.nameChar1;
        numberOfMonsters++;
    }

    //Default Contructer

    public MonsterTwo(){
        numberOfMonsters++;
    }

    public static void main(String args[]){
    }
}
