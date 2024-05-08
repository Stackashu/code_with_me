class solidSquare{
    void draw(int size){
    for(int i = 1; i <= size;i++){
        for ( int j = 1; j <= size ; j++ ){
        System.out.print(" * ");
        } 
        System.out.print("\n");
    }
    }
}
class hollowSquare{
    void draw(int size){
    for(int i = 1; i <= size;i++){
        for ( int j = 1; j <= size ; j++ ){
            if((i == 1 || j == size) || ( j == 1 || i == size) ){
                System.out.print("*" + " " );
            }else {
                System.out.print(" " + " " );
            }
        } 
        System.out.print("\n");
    }
    }
}

public class square {
    public static void main(String[] args) {
        solidSquare dabbi = new solidSquare();
        dabbi.draw(8);
        
       hollowSquare dabba = new hollowSquare();
       dabba.draw(5);
    }
}
